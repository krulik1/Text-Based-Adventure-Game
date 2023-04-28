
/**
 * title: Game.java
 * description: Creates and runs an instance of a text-based advanture game.
 * date: 07/09/2022
 * @author Jakub Krulik
 * @version 02
 * @copyright 2021-2022 Jakub Krulik
 */

/**
 * DOCUMENTATION. . .
 */

/**
 * Game
 *
 * Purpose and Description:
 * The purpose of this program is to create an instance of the text-based
 * adventure game.
 *
 * Compiling and Running Instructions
 *
 * Required: Game.java, Control.java, DLList.java, Item.java, Location.java, Character.java
 * Compile: javac Game.java
 * Run: java Game
 */

 /**
  * Classes
	*
	* Game:
	*  Creates an instance of the Game.
	* Constructors:
	*  public Game() {
	*  	Instantiates all game objects (Characters, Items, Locations).
	*
	* Attributes:
	*  	static Game game
			 - object that acts as the instance of the game.
			 This object must be accesible to the control class.

			DLList<Location> locations
			 - A doubly linked list of locations used in the game.
			static Boolean dead
			 - set to false by default, helps to determine the winning condition.
			static Boolean win
			 - set to false by default, stores the result of the winning condition.

			Location rabbitHole
			Location garden
			Location doors
			Location teaForest
			Location croquetField
			Location courtRoom
			Location dreamDoor
			 - locations in the game
			 must be accesible to the Control.Me class.

			ArrayList<Character> charList
			 - list of all the characters in the game.
	*
	* Methods:
	*  public static void main() {
	*		Runs the game. Creates an instance of the Control class and creates a
	*		Scanner object. Runs a loop that sends user input to the control class to
	*		be processed.
	*
	*
	* Item
	*  Creates an instance of the Game.
	* Constructors:
	*  public Item() {
	*  	Instantiates Item objects.
	*
	* Attributes:
	*  	String name
	*   - name of the item
	*   String description
	*   - text description of the item
	*   int state
	*   - current state of the item (read as a condition in the Control class)
	*
	* Constructors:
	*  public Item(String name, String description) {
	*		initializes the Item object with a name and a description.
	*
	* Methods:
	*  public String toString() {
	*   returns the name of the Item (used to print an ArrayList of Items).
	*
	*  public String getName() {
	*   returns the name of the Item.
	*
	*  public String description() {
	*   returns the description of the object.
	*
	*  public void changeState(int state) {
	*   updates the state of the Item.
	*
	*
	* DLList
	*  Data structure implementing a doubly-linked list
	*
	* Attributes:
	*  	int n
	*   - size of the DLList
	*   T x
	*   - the element stored in the list
	*
	* Constructors:
	*  public Item(String name, String description) {
	*		initializes the Item object with a name and a description.
	*
	* Methods:
	*  public String toString() {
	*   returns the name of the Item (used to print an ArrayList of Items).
	*/

	/**
	 * 	TESTING. . .
	 */

	/**
	 * Test Plan:
	 * 1. Compile and run the Game class.
	 *	EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************

			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.

	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
   *
	 * 2. Play the game.
	 * 2.1 Moving forwards.
		  Type "next" into the command line and press enter. (Repeat 2 times)
			After this is complete, exit the application.
			EXPECTED:
				By starting this application, you have entered into a world. . .

				A world that is different from our own.

				In this world. The terrain and population do not look very much
				different from that of your own. However, upon closer examination. . .

				*****************************<<Static>>******************************

				Your options are:
				                next -  move to the next location
				                prev -  move to the previous location
				    [character] talk -  talk to [character]
				          get [item] -  adds [item] to your inventory
				         drop [item] -  leaves [item] at your current location
				          use [item] -  uses the [item] in the way that it is designed to be used
				            describe -  describes the location
				      inventory or i -  Outputs the user's current inventory
				                 run -  run away from the danger

				                 opt -  shows the options

				Note that items have no spaces in their names


				You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

				Your goal is to find the rabbit. After that, do your best not to get killed.

				You are sitting in a garden in the afternoon. As time goes on, your mind
				starts to drift. . .

				Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
				You follow the hare, but soon you see that it is no where to be seen.
				After a while of blundering, you stumble upon a rabbit hole.
				next
				As you crawl through the rabbit hole, you suddenly feel yourself falling
				You see different objects stored in shelves along the lines of the
				gradualy widening chasm.

				You manage to grab a hold of one of the shelves. In front of you,
				you see a hammer.
				next
				You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
				In front of you, there is a table with
				three objects ontop of it.

				 Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.

	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 * 2.2 Moving backwards.
	 * 	Run the application.
	 *	Type "next" and press enter. (you will be in the rabbitHole room)
	 *	Type "prev" and press enter.
	 *  Type "next" and press enter.
	 * 	Input the following commands: "get smallkey", "get drinkme",
	 * 	"drink drinkme", "unlock", "prev"
	 *  EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 next
			 As you crawl through the rabbit hole, you suddenly feel yourself falling
			 You see different objects stored in shelves along the lines of the
			 gradualy widening chasm.

			 You manage to grab a hold of one of the shelves. In front of you,
			 you see a hammer.
			 prev
			 You can't go back now.

			 next
			 You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
			 In front of you, there is a table with
			 three objects ontop of it.

			  Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.
			 get smallkey
			 A small key
			 get drinkme
			 A vial that says "Drink Me"
			 drink drinkme
			 You shrink to very tiny
			 unlock
			 You have exited through the door.
			 You enter the forest from the room, and you feel disoriented. You hear
			 laughter in the distance. . .

			 You walk through the trees and see a rediculously decorated dining
			 table full of cakes and teapots. At the table are a number of peculiar
			 figures. You recognise one (the hare from earlier) and the only human
			 present is a tall lanky man with unruly hair and a worn top-hat.

			 Off to the side, there is a mushroom.
			 prev
			 You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
			 In front of you, there is a table with
			 three objects ontop of it.

			  Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.

	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
   * - The system will output "You can't go back now." when attempting to go
	 *	 back from the locations: rabbitHole, doors, and dreamDoor.
	 *
	 * 2.3 Picking up objects.
	 *	Run the application.
	 *	Type "next" and press enter.
	 *	Type "get hammer" or "hammer get" with any capitalization.
	 *	Type "inventory" or "i".
	 *  EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 next
			 As you crawl through the rabbit hole, you suddenly feel yourself falling
			 You see different objects stored in shelves along the lines of the
			 gradualy widening chasm.

			 You manage to grab a hold of one of the shelves. In front of you,
			 you see a hammer.
			 get hammer
			 A wooden hammer, why was it in a rabbit hole?
			 i
			 [hammer]
	 *
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 * 2.4 Talking to characters
	 * 	Run the application.
	 *	Input the following commands (pressing enter after each): "next", "next",
	 * 	"get smallkey", "get drinkme", "drink drinkme", "unlock", "talk hatter"
	 *
	 * 	EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 next
			 As you crawl through the rabbit hole, you suddenly feel yourself falling
			 You see different objects stored in shelves along the lines of the
			 gradualy widening chasm.

			 You manage to grab a hold of one of the shelves. In front of you,
			 you see a hammer.
			 next
			 You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
			 In front of you, there is a table with
			 three objects ontop of it.

			  Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.
			 get smallkey
			 A small key
			 get drinkme
			 A vial that says "Drink Me"
			 drink drinkme
			 You shrink to very tiny
			 unlock
			 You have exited through the door.
			 You enter the forest from the room, and you feel disoriented. You hear
			 laughter in the distance. . .

			 You walk through the trees and see a rediculously decorated dining
			 table full of cakes and teapots. At the table are a number of peculiar
			 figures. You recognise one (the hare from earlier) and the only human
			 present is a tall lanky man with unruly hair and a worn top-hat.

			 Off to the side, there is a mushroom.
			 talk hatter
			 "Would you like a cup of tea?"

	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 * 2.5 Using Items
	 * 	Run the application.
	 * 	Input the following commands: "next", "get hammer", "next", "use hammer"
	 *
	 *  EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 next
			 As you crawl through the rabbit hole, you suddenly feel yourself falling
			 You see different objects stored in shelves along the lines of the
			 gradualy widening chasm.

			 You manage to grab a hold of one of the shelves. In front of you,
			 you see a hammer.
			 get hammer
			 A wooden hammer, why was it in a rabbit hole?
			 next
			 You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
			 In front of you, there is a table with
			 three objects ontop of it.

			  Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.
			 use hammer
			 Try as you might, but you cannot break the doors. They are just too sturdy.
   *
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 * 2.6 Descriptions
	 * Run the application.
	 * Input the following commands: "describe"
	 *
	 * 	EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 describe
			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
	 *
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 * 2.7 losing
	 * Run the application
	 * Input the following commands (either "drink" or "use" is valid): "next",
	 * "next", "get smallkey", "get drinkme", "drink drinkme", "use smallkey",
	 * "talk hatter", "get tea", "drink tea"
	 *
	 * 	EXPECTED:
	 			By starting this application, you have entered into a world. . .

				A world that is different from our own.

				In this world. The terrain and population do not look very much
				different from that of your own. However, upon closer examination. . .

				*****************************<<Static>>******************************
				Your options are:
				                next -  move to the next location
				                prev -  move to the previous location
				    [character] talk -  talk to [character]
				          get [item] -  adds [item] to your inventory
				         drop [item] -  leaves [item] at your current location
				          use [item] -  uses the [item] in the way that it is designed to be used
				            describe -  describes the location
				      inventory or i -  Outputs the user's current inventory
				                 run -  run away from the danger

				                 opt -  shows the options

				Note that items have no spaces in their names


				You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

				Your goal is to find the rabbit. After that, do your best not to get killed.

				You are sitting in a garden in the afternoon. As time goes on, your mind
				starts to drift. . .

				Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
				You follow the hare, but soon you see that it is no where to be seen.
				After a while of blundering, you stumble upon a rabbit hole.
				next
				As you crawl through the rabbit hole, you suddenly feel yourself falling
				You see different objects stored in shelves along the lines of the
				gradualy widening chasm.

				You manage to grab a hold of one of the shelves. In front of you,
				you see a hammer.
				next
				You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
				In front of you, there is a table with
				three objects ontop of it.

				 Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.
				get smallkey
				A small key
				get drinkme
				A vial that says "Drink Me"
				drink drinkme
				You shrink to very tiny
				use smallkey
				You have exited through the door.
				You enter the forest from the room, and you feel disoriented. You hear
				laughter in the distance. . .

				You walk through the trees and see a rediculously decorated dining
				table full of cakes and teapots. At the table are a number of peculiar
				figures. You recognise one (the hare from earlier) and the only human
				present is a tall lanky man with unruly hair and a worn top-hat.

				Off to the side, there is a mushroom.
				talk hatter
				"Would you like a cup of tea?"

				get tea
				Oddly smelling tea. . . should I drink it?
				drink tea
				You died of tea poisoning
				You died.
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 * 2.8 winning
	 *  Run the application.
	 *  Input the following commands: "next", "get hammer", "fall", "get smallkey",
	 *	"get drinkme", "drink drinkme", "unlock", "get mushroom", "eat mushroom",
	 *	"next", "talk queen", "eat mushroom", "run", "smash"
	 *
	 *  EXPECTED:
	 			By starting this application, you have entered into a world. . .

				A world that is different from our own.

				In this world. The terrain and population do not look very much
				different from that of your own. However, upon closer examination. . .

				*****************************<<Static>>******************************
				Your options are:
				                next -  move to the next location
				                prev -  move to the previous location
				    [character] talk -  talk to [character]
				          get [item] -  adds [item] to your inventory
				         drop [item] -  leaves [item] at your current location
				          use [item] -  uses the [item] in the way that it is designed to be used
				            describe -  describes the location
				      inventory or i -  Outputs the user's current inventory
				                 run -  run away from the danger

				                 opt -  shows the options

				Note that items have no spaces in their names


				You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

				Your goal is to find the rabbit. After that, do your best not to get killed.

				You are sitting in a garden in the afternoon. As time goes on, your mind
				starts to drift. . .

				Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
				You follow the hare, but soon you see that it is no where to be seen.
				After a while of blundering, you stumble upon a rabbit hole.
				next
				As you crawl through the rabbit hole, you suddenly feel yourself falling
				You see different objects stored in shelves along the lines of the
				gradualy widening chasm.

				You manage to grab a hold of one of the shelves. In front of you,
				you see a hammer.
				get hammer
				A wooden hammer, why was it in a rabbit hole?
				fall
				You are in a room full of doors. There is one door that stands out. "Why would anyone make a door so small" you think.
				In front of you, there is a table with
				three objects ontop of it.

				 Upon further inspection, you see a vial labled 'Drink Me', a lump of. . . something labled 'Eat Me', and a small key.
				get smallkey
				A small key
				get drinkme
				A vial that says "Drink Me"
				drink drinkme
				You shrink to very tiny
				unlock
				You have exited through the door.
				You enter the forest from the room, and you feel disoriented. You hear
				laughter in the distance. . .

				You walk through the trees and see a rediculously decorated dining
				table full of cakes and teapots. At the table are a number of peculiar
				figures. You recognise one (the hare from earlier) and the only human
				present is a tall lanky man with unruly hair and a worn top-hat.

				Off to the side, there is a mushroom.
				get mushroom
				A mushroom that smells similar to "Eat Me"
				eat mushroom
				You grow to normal size
				next
				The rabbit leads you to meet the queen in the croquet field.

				As the wind blows through your hair, you hear an ear-piercing screech:
				"OFF WITH HIS HEAD!"

				You start to feel nervous as you head in the direction of the yelling.

				The hare speaks: "Don't worry, as long as your head isn't higher than hers, she will leave you be."
				The hare offers you a croquet mallot.

				talk queen
				"Who is this?? AH! It must have been you! Take her!"
				An atmosphere filled with hostility greets you as you walk into the court
				room. You think to yourself "What could I have possibly done wrong. . . I must escape, maybe if I eat some Eat Me they will be afraid to capture me. . ."

				"DOES THE DEFENDANT WISH TO SPEAK?"

				(Do you wish to respond?): (y/n)
				eat mushroom
				You grow very big
				run
				As you run from the court room, you see a locked door.
				"Can I use anything to break this door? You must act fast, as you can already hear the angry mob running after you.
				smash
				You smash the door as hard as you can with the hammer, both the hammer and door splinter, and you see a blinding light.
				You wake up back in the gardens.
				Turns out it was all a bad dream.You hear a call in the distance
				"It's tea time Alice!"
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 *
	 * 3 Invalid Input:
	 * 3.1 Irregular one-word input (note, capitalization is removed from user
	 * input in the control class)
	 * Run the application.
	 * Input the command: "irregular"
	 *
	 * EXPECTED:
	 		By starting this application, you have entered into a world. . .

			A world that is different from our own.

			In this world. The terrain and population do not look very much
			different from that of your own. However, upon closer examination. . .

			*****************************<<Static>>******************************
			Your options are:
			                next -  move to the next location
			                prev -  move to the previous location
			    [character] talk -  talk to [character]
			          get [item] -  adds [item] to your inventory
			         drop [item] -  leaves [item] at your current location
			          use [item] -  uses the [item] in the way that it is designed to be used
			            describe -  describes the location
			      inventory or i -  Outputs the user's current inventory
			                 run -  run away from the danger

			                 opt -  shows the options

			Note that items have no spaces in their names


			You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			Your goal is to find the rabbit. After that, do your best not to get killed.

			You are sitting in a garden in the afternoon. As time goes on, your mind
			starts to drift. . .

			Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			You follow the hare, but soon you see that it is no where to be seen.
			After a while of blundering, you stumble upon a rabbit hole.
			irregular
			Please use valid input. To learn about valid input, type: "opt"
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 *  3.2 Irregular two-word input.
	 *	 Run the application
	 *	 Input the command: "irregular command"
	 *  EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 irregular command
			 Please use valid input. To learn about valid input, type: "opt"

	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 *
	 *  3.3 Calling get in a room with no items.
	 *   Run the application
	 * 	 Input the command: "get hat"
	 *
	 * EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 get hat
			 There aren't any items here

	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 *
	 *  3.4 Calling get on an Item that is not present.
	 *	 Run the application
	 *	 Input the commands: "next", "get hat"
	 *
	 *  EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 next
			 As you crawl through the rabbit hole, you suddenly feel yourself falling
			 You see different objects stored in shelves along the lines of the
			 gradualy widening chasm.

			 You manage to grab a hold of one of the shelves. In front of you,
			 you see a hammer.
			 get hat
			 There is no item: hat here.

	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 *
	 *  3.5 Calling use on an item that is not in inventory.
	 *   Run the application
	 * 	 Input the command: "use smallkey"
	 *
	 *  EXPECTED:
				By starting this application, you have entered into a world. . .

				A world that is different from our own.

				In this world. The terrain and population do not look very much
				different from that of your own. However, upon closer examination. . .

				*****************************<<Static>>******************************
				Your options are:
				                next -  move to the next location
				                prev -  move to the previous location
				    [character] talk -  talk to [character]
				          get [item] -  adds [item] to your inventory
				         drop [item] -  leaves [item] at your current location
				          use [item] -  uses the [item] in the way that it is designed to be used
				            describe -  describes the location
				      inventory or i -  Outputs the user's current inventory
				                 run -  run away from the danger

				                 opt -  shows the options

				Note that items have no spaces in their names


				You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

				Your goal is to find the rabbit. After that, do your best not to get killed.

				You are sitting in a garden in the afternoon. As time goes on, your mind
				starts to drift. . .

				Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
				You follow the hare, but soon you see that it is no where to be seen.
				After a while of blundering, you stumble upon a rabbit hole.
				use smallkey
				Please use valid input. To learn about valid input, type: "opt"
				You do not have the item: smallkey in your inventory now.
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 *
	 *
	 *  3.6 Calling talk on a character that is not present.
	 *   Run the application
	 *   Input the command: "talk queen"
	 *
	 *  EXPECTED:
			 By starting this application, you have entered into a world. . .

			 A world that is different from our own.

			 In this world. The terrain and population do not look very much
			 different from that of your own. However, upon closer examination. . .

			 *****************************<<Static>>******************************
			 Your options are:
			                 next -  move to the next location
			                 prev -  move to the previous location
			     [character] talk -  talk to [character]
			           get [item] -  adds [item] to your inventory
			          drop [item] -  leaves [item] at your current location
			           use [item] -  uses the [item] in the way that it is designed to be used
			             describe -  describes the location
			       inventory or i -  Outputs the user's current inventory
			                  run -  run away from the danger

			                  opt -  shows the options

			 Note that items have no spaces in their names


			 You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.

			 Your goal is to find the rabbit. After that, do your best not to get killed.

			 You are sitting in a garden in the afternoon. As time goes on, your mind
			 starts to drift. . .

			 Suddenly a hare runs infront of you yelling "I'm late, I'm late!"
			 You follow the hare, but soon you see that it is no where to be seen.
			 After a while of blundering, you stumble upon a rabbit hole.
			 talk queen
			 queen is not here.
	 *
	 *	ACTUAL:
	 *   As expected, confirmed by running the solution.
	 */

	 //imports
	 import java.util.ArrayList;
	 import java.util.Scanner;


	 public class Game {

	 	static Game game = new Game();

	 	DLList<Location> locations;
	 	static Boolean dead = false;
	 	static Boolean win = false;

	 	Location rabbitHole;
	 	Location garden;
	 	Location doors;
	 	Location teaForest;
	 	Location croquetField;
	 	Location courtRoom;
	 	Location dreamDoor;

	 	ArrayList<Character> charList;
	 	ArrayList<Item> itemList;

	 	public Game() {

	 		rabbitHole = new Location("rabbitHole",
	 				"As you crawl through the rabbit hole, you suddenly feel yourself falling\n"
	 						+ "You see different objects stored in shelves along the lines of the\n"
	 						+ "gradualy widening chasm.\n\n"
	 						+ "You manage to grab a hold of one of the shelves. In front of you,\n" + "you see a hammer.",
	 				doors, garden, "If you try to do anything but hold on, you will fall.");

	 		garden = new Location("garden", "You are sitting in a garden in the afternoon. As time goes on, your mind\n"
	 				+ "starts to drift. . .\n\n" + "Suddenly a hare runs infront of you yelling \"I'm late, I'm late!\"\n"
	 				+ "You follow the hare, but soon you see that it is no where to be seen.\n"
	 				+ "After a while of blundering, you stumble upon a rabbit hole.", rabbitHole, garden, "Why would you try to damage the garden?");

	 		doors = new Location("doors", "You are in a room full of doors. There is one door that stands out. \"Why would anyone make a door so small\" you think.\n"
	 				+ "In front of you, there is a table with\n"
	 				+ "three objects ontop of it.\n\n Upon further inspection, you see a vial "
	 				+ "labled \'Drink Me\', a lump of. . . something labled \'Eat Me\', and a " + "small key.",
	 				teaForest, doors, "Try as you might, but you cannot break the doors. They are just too sturdy.");

	 		teaForest = new Location("teaForest", "You enter the forest from the room, and you feel disoriented. You hear\n"
	 				+ "laughter in the distance. . .\n\n"
	 				+ "You walk through the trees and see a rediculously decorated dining\n"
	 				+ "table full of cakes and teapots. At the table are a number of peculiar\n"
	 				+ "figures. You recognise one (the hare from earlier) and the only human\n"
	 				+ "present is a tall lanky man with unruly hair and a worn top-hat.\n\n"
	 				+ "Off to the side, there is a mushroom.", croquetField, doors, "You are too tired to create a ruckus.");

	 		croquetField = new Location("croquetField", "The rabbit leads you to meet the queen in the croquet field.\n\n"
	 				+ "As the wind blows through your hair, you hear an ear-piercing screech:\n"
	 				+ "\"OFF WITH HIS HEAD!\"\n\n"
	 				+ "You start to feel nervous as you head in the direction of the yelling.\n\n"
	 				+ "The hare speaks: \"Don't worry, as long as your head isn't higher than "
	 				+ "hers, she will leave you be.\"\n" + "The hare offers you a croquet mallot.\n", courtRoom, teaForest, "It is best not to show your rage in front of the Queen.");

	 		courtRoom = new Location("courtRoom","An atmosphere filled with hostility greets you as you walk into the court\n"
	 				+ "room. You think to yourself \"What could I have possibly done wrong. . . I must escape, maybe if I eat some Eat Me they will be afraid to capture me. . .\"\n\n"
	 				+ "\"DOES THE DEFENDANT WISH TO SPEAK?\"\n\n" + "(Do you wish to respond?): (y/n)", dreamDoor,
	 				croquetField, "The crowd screams.\n");

	 		dreamDoor = new Location("dreamDoor", "As you run from the court room, you see a locked door.\n"
	 				+ "\"Can I use anything to break this door? "
	 				+ "You must act fast, as you can already hear the angry mob running after you.", croquetField, courtRoom,
	 				"You smash the door as hard as you can with the hammer, both the hammer and door splinter, and you see a blinding light.");

	 		locations = new DLList<>();
	 		locations.add(0, garden);
	 		locations.add(1, rabbitHole);
	 		locations.add(2, doors);
	 		locations.add(3, teaForest);
	 		locations.add(4, croquetField);
	 		locations.add(5, courtRoom);
	 		locations.add(6, dreamDoor);

	 		Item drinkMe;
	 		Item eatMe;
	 		Item smallKey;
	 		Item mushroom;
	 		Item hat;
	 		Item door;
	 		Item hammer;
	 		Item tea;
	 		Item croquetMallot;

	 		drinkMe = new Item("drinkme", "A vial that says \"Drink Me\"");

	 		eatMe = new Item("eatme", "A piece of food labled \"Eat Me\"");

	 		smallKey = new Item("smallkey", "A small key");

	 		mushroom = new Item("mushroom", "A mushroom that smells similar to \"Eat Me\"");

	 		hat = new Item("hat", "The hatter's hat.");

	 		door = new Item("door", "The smallest door.");

	 		hammer = new Item("hammer", "A wooden hammer, why was it in a rabbit hole?");

	 		tea = new Item("tea", "Oddly smelling tea. . . should I drink it?");

	 		croquetMallot = new Item("croquetmallot", "Given to me by the queen.");

	 		rabbitHole.drop(hammer);
	 		doors.drop(smallKey);
	 		doors.drop(eatMe);
	 		doors.drop(drinkMe);
	 		teaForest.drop(tea);
	 		teaForest.drop(hat);
			teaForest.drop(mushroom);
	 		croquetField.drop(croquetMallot);

			itemList = new ArrayList<Item>();
	 		itemList.add(croquetMallot);//index 0
	 		itemList.add(eatMe); 		//index 1
	 		itemList.add(drinkMe); 		//index 2
	 		itemList.add(smallKey); 	//index 3
	 		itemList.add(tea); 			//index 4
	 		itemList.add(hammer); 		//index 5
	 		itemList.add(hat); 			//index 6
	 		itemList.add(mushroom); 	//index 7
	 		itemList.add(door); 		//index 8


	 		Character hare;
	 		Character hatter;
	 		Character queen;
	 		Character tortoise;
	 		Character guard;
	 		Character judge;

	 		hare = new Character("hare", "\"I'm late, I'm late\"\n");

	 		hatter = new Character("hatter", "\"Would you like a cup of tea?\"\n");

	 		queen = new Character("queen", "\"Who is this?? AH! It must have been you! Take her!\"\n");

	 		tortoise = new Character("tortoise", "\"Ah, I was expecting you. . . Who are you?\"\n");

	 		guard = new Character("guard", "\"Who goes there??\"\n");

	 		judge = new Character("judge", "\"We've heard enough, she's guilty!\"\n");

	 		queen.addDialogue("\"Look at her. . . She's so big! Off with her head!\"\n");

			judge.addDialogue("\"She's trying to get away! Capture her!\"");

	 		charList = new ArrayList<>(5);

	 		charList.add(tortoise); // index 0
	 		charList.add(queen); 	// index 1
	 		charList.add(hatter); 	// index 2
	 		charList.add(hare); 	// index 3
	 		charList.add(guard); 	// index 4
	 		charList.add(judge); 	// index 5

	 		teaForest.addCharacter(hatter);
	 		teaForest.addCharacter(hare);
	 		croquetField.addCharacter(queen);
	 		croquetField.addCharacter(tortoise);
	 		croquetField.addCharacter(guard);
	 		courtRoom.addCharacter(guard);


	 	}

	 	public static void main(String args[]) {

	 		//game = new Game();
	 		Control control = new Control(game.locations.get(0));
	 		Scanner stdin = new Scanner(System.in);
	 		String inp;

	 		System.out.println("By starting this application, you have entered into a world. . .\n\n"
	 				+ "A world that is different from our own.\n\n"
	 				+ "In this world. The terrain and population do not look very much\n"
	 				+ "different from that of your own. However, upon closer examination. . .\n");

	 		System.out.println("*****************************<<Static>>******************************");

	 		System.out.println(Control.options());
	 		System.out.println("You may use other commands more specific to the location (i.e., fall) but keep in mind that the whole English lexicon is not implemented.\n");
	 		System.out.println("Your goal is to find the rabbit. After that, do your best not to get killed.\n");

	 		System.out.println(Control.process("describe"));

	 		// input loop
	 		while (!dead && !win) {
	 			inp = stdin.nextLine();
	 			//System.out.println("THIS:" +Control.me.current.next.description +"\n");
	 			System.out.println(Control.process(inp.toLowerCase()));
	 		} 

	 		if (dead == true) {
	 			System.out.println("You died.");
	 		} else {
	 			System.out.println(
	 					"You wake up back in the gardens.\n"
	 					+ "Turns out it was all a bad dream."
	 					+ "You hear a call in the distance\n"
	 					+ "\"It\'s tea time Alice!\"\n");
	 		}

	 	} // end of main() method
	 } // end of class Game
