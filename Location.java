
/**
 * title: Location.java
 * description: Class that is used to create Location objects for Game.java.
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

 // imports
import java.util.ArrayList;

public class Location {

	final String name; // name of the room
	final Location next; // next room
	final Location prev; // previous room
	final String smash; // the result of a smash command
	ArrayList<Item> items = new ArrayList<>(); // list of items at location
	ArrayList<Character> character = new ArrayList<>(); // characters at location
	String description; // output description for room

	/**
	 * constructs a room based off of method parameters.
	 *
	 * @param name name of the room.
	 * @param description the description of the room.
	 * @param next the next room.
	 * @param prev the previous room.
	 * @param smash the resulting output when the smash command is requested in
	 * the room.
	 */
	public Location(String name, String description, Location next, Location prev, String smash) {
		this.name = name;
		this.description = description;
		this.next = next;
		this.prev = prev;
		this.smash = smash;
	}

	/**
	 * @returns the next room.
	 */
	public Location next() {
		return next;
	} // end of next() method

	/**
	 * @returns prev the previous room.
	 */
	public Location prev() {
		return prev;
	} // end of the prev() method

	/**
	 * @returns description the description of the room.
	 */
	public String describe() {
		return description;
	} // end of the describe() method

	/**
	 * player chooses to leave an item at the location.
	 *
	 * @param x the item to be left at the room.
	 */
	public void drop(Item x) {
		items.add(x);
	} // adds an item to the location

	/**
	 * @returns s a list of items in the room in the form of a String.
	 */
	public String itemList() {
		return items.toString();
	} // end of itemList() method

	/**
	 * @returns x Item in the list, if exists.
	 */
	public Item getItem(Item x) {
		if (items.contains(x)) {
			return items.remove(items.indexOf(x));
		} else {
			return null;
		}
	} // end of get() method;

	/**
	 * @returns smash the resulting String output from a smash.
	 */
	public String smash() {
		return smash;
	} // end of smash() method

	/**
	 * Adds a character to the location.
	 *
	 * @param character the character to be added to the location.
	 */
	public void addCharacter(Character character) {
		this.character.add(character);
	} // end of addCharacter(character) method

} // end of class Location
