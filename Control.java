/**
 * title: Control.java
 * description: Class that handles the game logic for Game.java.
 * date: 07/09/2022
 * @author 3509416 Jakub Krulik
 * @version 02
 * @copyright 2021-2022 Jakub Krulik
 */

/**
 * TESTING. . .
 */

/**
 * All testing done in the Game.java class
 */

/**
 * CODE. . .
 */

 //imports
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Control {

	// class represents the player
	public static class Me {
		/** Attributes of Control.Me class */
		String size; // options: big, small, norm
		Location current; // current location of the player
		int loc; // location via index stored in DLList
		ArrayList<Item> inventory; // Item inventory


		/**
		 * Constructor:
		 * Creates a new instance of the Me class (the player).
		 */
		public Me() {
			inventory = new ArrayList<Item>(24);
			size = "norm";
			loc = 0;
		}

		/**
		 * Method changes the size of the player.
		 *
		 * @returns s the output to be printed to the command line.
		 */
		public String size(String s) {
			if (s.equals("drinkme")&&size.equals("norm")) {
				size = "small";
				return "You shrink to very tiny";
			} else if (s.equals("drinkme")&&size.equals("small")) {
				return "Nothing Happens";
			} else if (s.equals("drinkme")&&size.equals("big")) {
				size = "norm";
				return "You shrink to normal size";
			} else if ((s.equals("eatme")||s.equals("mushroom"))&&size.equals("small")) {
				size = "norm";
				return "You grow to normal size";
			} else if ((s.equals("eatme")||s.equals("mushroom"))&&size.equals("norm")) {
				size = "big";
				return "You grow very big";
			} else if ((s.equals("eatme")||s.equals("mushroom"))&&size.equals("big")) {
				return "nothing happens";
			} else {
				return "nothing happens";
			}
		}


		// increments the location
		public void next() {
			if (loc == 6) {
				System.out.println("action unavailable");
			} else {
				current = Game.game.locations.get(loc+1);
				loc++;
			}
		} // end of next() method

		// decrements the location
		public void prev() {
			 if (loc == 0) {
				 System.out.println("action unavailable");
			 } else {
				current = Game.game.locations.get(loc-1);
				loc--;
			 }
		} // end of prev() method
	} // end of class Me

	/** Attributes of Control class */
	static Me me = new Me(); // creates an instance of the player

	/**
	 * Constructor:
	 * Creates an instance of the control class with a Location object storing the
	 * starting location.
	 */
	public Control(Location loc) {
		me.current = loc;
	} // constructor Control()

	/**
	 * Method containing the user options menu.
	 *
	 * @returns s the options menu in the form of a formatted string.
	 */
	public static String options() {
		StringBuilder opt = new StringBuilder("Your options are:\n");

		opt.append(String.format("%20s -  %-5s", "next", "move to the next location\n"));
		opt.append(String.format("%20s -  %-5s", "prev", "move to the previous location\n"));
		opt.append(String.format("%20s -  %-5s", "[character] talk", "talk to [character]\n"));
		opt.append(String.format("%20s -  %-5s", "get [item]", "adds [item] to your inventory\n"));
		opt.append(String.format("%20s -  %-5s", "drop [item]", "leaves [item] at your current location\n"));
		opt.append(String.format("%20s -  %-5s", "use [item]",
				"uses the [item] in the way that it is designed to be used\n"));
		opt.append(String.format("%20s -  %-5s", "describe", "describes the location\n"));
		opt.append(String.format("%20s -  %-5s", "inventory or i", "Outputs the user's current inventory\n"));
		opt.append(String.format("%20s -  %-5s", "run", "run away from the danger \n\n"));
		opt.append(String.format("%20s -  %-5s", "opt", "shows the options \n\n"));
		opt.append("Note that items have no spaces in their names\n\n");

		return opt.toString();
	} // end of options() method

	/**
	 * Method containing majority of the Game logic.
	 *
	 * @param inp the user input to be processed.
	 * @returns s a string to be output to the command line as a result of an
	 * action requested by the user.
	 */
	public static String process(String inp) {

		/** String variables which will break the input from the string tokenizer down */
		String p1;
		String p2;
		StringTokenizer st = new StringTokenizer(inp);

		try {
			p1 = st.nextToken();
		} catch (Exception e) {
			return "Please use valid input. To learn about valid input, type: \"opt\"\n";
		}

		if (st.hasMoreElements()) {
			p2 = st.nextToken();
		} else {
			p2 = null;
		}


		if (p2 == null) {
			if (p1.equals("opt")) {
				return options();
			} else if (p1.equals("next")&& me.current.name.equals("croquetteField")) {
				return "There is nowhere else to go.";
			} else if ((p1.equals("run")||p1.equals("next")) && me.current.name.equals("courtRoom")&& me.size.equals("big")) {
				me.next();
				return me.current.describe();
			} else if ((p1.equals("run")||p1.equals("next")) && me.current.name.equals("courtRoom")&& !me.size.equals("big")) {
				Game.dead = true;
				return Game.game.charList.get(5).speak(1);
			} else if (p1.equals("run") && !me.current.name.equals("courtRoom")) {
				return "Why would I run. . . \n";
			} else if (p1.equals("next") &&  me.current.name.equals("doors")&&Game.game.itemList.get(8).state == 1) {
				me.next();
				return me.current.describe();
			} else if (p1.equals("next") &&  me.current.name.equals("doors")) {
				return "The door is locked.";
			} else if (p1.equals("next") || (p1.equals("fall") && me.current.name.equals("rabbitHole") && !me.current.name.equals("doors"))) {
					me.next();
				return me.current.describe();
			} else if (p1.equals("prev") && (me.current.equals(Game.game.rabbitHole) || me.current.equals(Game.game.doors) || me.current.equals(Game.game.dreamDoor))) {
				return "You can't go back now.\n";
			} else if (p1.equals("prev")) {
				me.prev();
				return me.current.describe();
			} else if (p1.equals("describe")) {
				return me.current.describe();
			} else if (p1.equals("inventory") || p1.equals("i")) {
				return me.inventory.toString();
			} else if ((p1.equals("yes")||p1.equals("no")||p1.equals("n")|p1.equals("y"))&& me.current.name.equals("courtRoom")) {
				Game.dead = true;
				return "Judge: " + Game.game.charList.get(5).speak();
			} else if (p1.equals("smash") && (me.current.name.equals("croquetField") || me.current.name.equals("courtRoom"))) {
				Game.dead = true;
				return me.current.smash();
			} else if (p1.equals("smash") && (me.current.name.equals("doors") || me.current.name.equals("teaForest") || me.current.name.equals("garden") || me.current.name.equals("rabbitHole"))) {
				return me.current.smash();
			} else if (p1.equals("smash") && (me.current.name.equals("courtRoom") || me.current.name.equals("croquetField"))) {
				Game.dead = true;
				return me.current.smash();
			} else if (p1.equals("smash")) {
				Game.win = true;
				return me.current.smash();
			} else if (p1.equals("unlock")) {
				return Control.process("use smallkey");
			}
		} else {
			if ((p1.equals("talk") || p2.equals("talk"))&&((p1.equals("queen") || p2.equals("queen")))&&(me.size.equals("big")||me.inventory.contains(Game.game.itemList.get(6)))) {

				if (p1.equals("talk")) {
					Game.dead = true;
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.current.character.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return p2 + " is not here.";
					}
					me.current.character.get(i).changeState(1);
					return me.current.character.get(i).speak();
				} else {
					Game.dead = true;
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.current.character.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return p1 + " is not here.";
					}
					me.current.character.get(i).changeState(1);
					return me.current.character.get(i).speak();
				}

			} else if ((p1.equals("talk") || p2.equals("talk"))&&((p1.equals("queen") || p2.equals("queen")))&&(me.size.equals("small"))) {
				return "The queen can't see you.";
			} else if ((p1.equals("talk") || p2.equals("talk"))&&((p1.equals("queen") || p2.equals("queen")))&&(me.size.equals("norm"))) {
				if (p1.equals("talk")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.current.character.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return p2 + " is not here.";
					}
					String s = me.current.character.get(i).speak();
					me.next();
					return s + me.current.describe();
				} else {
					int i = 0;
					try {
						while (!me.current.character.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return p1 + " is not here.";
					}
					String s = me.current.character.get(i).speak();
					me.next();
					return s + me.current.describe();
				}

			} else if (p1.equals("talk") || p2.equals("talk")) { //talk command case
				if (p1.equals("talk")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.current.character.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return p2 + " is not here.";
					}
					return me.current.character.get(i).speak();
				} else {
					int i = 0;
					try {
						while (!me.current.character.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return p1 + " is not here.";
					}
					return me.current.character.get(i).speak();
				}
			} else if (p1.equals("get") || p2.equals("get")) { // get command case
				if (me.current.items.size() == 0) {
					return "There aren't any items here";
				}
				if (p1.equals("get")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.current.items.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return "There is no item: " + p2 + " here.";
					}
					if (me.current.items.get(i).getName().equals(p2)) {
						me.inventory.add(me.current.items.get(i));
						String s = me.current.items.get(i).description();
						me.current.items.remove(i);
						return s;
					}
				} else if (p2.equals("get")) {
					int i = 0;
					try {
						while (!me.current.items.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return "There is no item: " + p1 + " here.";
					}
					if (me.current.items.get(i).getName().equals(p1)) {
						me.inventory.add(me.current.items.get(i));
						String s = me.current.items.get(i).description();
						me.current.items.remove(i);
						return s;
					}
				}
			} else if (((((p1.equals("use")||p1.equals("drink")) || (p2.equals("use")|| p2.equals("drink")))&&(p1.equals("drinkme") || p2.equals("drinkme"))))) {
				if (me.inventory.size() == 0) {
					return "Your inventory is empty";
				}

				if (p1.equals("use") || p1.equals("drink")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p2 + " in your inventory.";
					}
					return me.size(p2);
				} else {
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p1 + " in your inventory.";
					}
					return me.size(p1);
				}
			} else if ((p1.equals("use") || p2.equals("use")||p1.equals("eat")||p2.equals("eat"))&&(p1.equals("eatme") || p2.equals("eatme"))) {
				if (me.inventory.size() == 0) {
					return "Your inventory is empty";
				}

				if (p1.equals("use")||p1.equals("eat")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p2 + " in your inventory.";
					}
					return me.size(p2);
				} else if (p2.equals("use")||p2.equals("eat")){
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p1 + " in your inventory.";
					}
					return me.size(p1);
				}
			} else if ((p1.equals("use") || p2.equals("use")||p1.equals("eat")||p2.equals("eat"))&&(p1.equals("mushroom") || p2.equals("mushroom"))) {
				if (me.inventory.size() == 0) {
					return "Your inventory is empty";
				}

				if (p1.equals("use")||p1.equals("eat")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p2 + " in your inventory.";
					}
					return me.size(p2);
				} else if (p2.equals("use")||p1.equals("eat")) {
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p1 + " in your inventory.";
					}
					return me.size(p1);
				}
			} else if ((p1.equals("use") || p2.equals("use"))&&(p1.equals("smallkey") || p2.equals("smallkey"))&&(me.current.name.equals("doors"))) {
				if (!me.size.equals("small")) {
					return "The door is too small for you to fit";
				}
				if (me.inventory.size() == 0) {
					return "Your inventory is empty";
				}
				Game.game.itemList.get(8).changeState(1);

				if (p1.equals("use")) {
					// sequential search because the number of elements in the list is small.
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p2)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p2 + " in your inventory.";
					}
					me.next();
					return "You have exited through the door.\n" + me.current.describe();
				} else if (p2.equals("use")) {
					int i = 0;
					try {
						while (!me.inventory.get(i).getName().equals(p1)) {i++;}
					} catch (Exception e) {
						return "You do not have the item: " + p1 + " in your inventory.";
					}
					me.next();
					return ("You have exited through the door.\n\n" + me.current.describe());
				}
			} else if ((p1.equals("use") || p2.equals("use"))&&(p1.equals("door") || p2.equals("door"))&&Game.game.itemList.get(8).state ==1) {
				me.next();
				return me.current.describe();
			} else if ((p1.equals("use") || p2.equals("use"))&&(p1.equals("door") || p2.equals("door"))) {
				return "The door is locked.";
			} else if ((p1.equals("use") || p2.equals("use"))&&(p1.equals("hat") || p2.equals("hat"))) {
				return "Very chique";
			} else if ((p1.equals("use") || p2.equals("use"))&&(p1.equals("hammer") || p2.equals("hammer"))) {
				return Control.process("smash");
			}  else if (((p1.equals("use")||p1.equals("drink")) || (p2.equals("use")||p2.equals("drink")))&&(p1.equals("tea") || p2.equals("tea"))) {
				Game.dead = true;
				return "You died of tea poisoning";
			} else if ((p1.equals("use") || p2.equals("use"))) {
				if (p1.equals("use")) {
					return "You do not have the item: " + p2 + " in your inventory now.";
				} else {
					return "You do not have the item: " + p1 + " in your inventory now.";
				}
			}
		} // end of control logic

		return "Please use valid input. To learn about valid input, type: \"opt\"\n\n";
   } // end of process() method

} // end of class Control
