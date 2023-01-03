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
public class Character implements Comparable<Character> {
  /** name of the character */
  final String name;

  /** arraylist stores all the possible dialogue outputs for a character */
  ArrayList<String> dialogue = new ArrayList<String>();

  /**
   * stores the current character state i.e. character will have different
   * dialogue during a different state.
   */
  int state;

  /**
   * Constructor:
   * Creates an instance of the Character class.
   *
   * @param name the name of the character.
   * @param dialogue the dialogue at state 0.
   */
  public Character(String name, String dialogue) {
    this.name = name;
    this.dialogue.add(dialogue);
    state = 0;
  } // Character constructor

  /**
   * Method overrides the compareTo class.
   *
   * @param c a Character object.
   */
  public int compareTo(Character c) {
	  return this.name.compareTo(c.name);
  } // end of overriden compareTo(T) method

  /**
   * @returns name the name of the character
   */
  public String getName() {
	  return name;
  } // end of  getName() method

  /**
   * Adds dialogue for the character states 1 -> n.
   *
   * @param dialogue string with new dialogue to be added to the character's
   * lexicon
   */
  public void addDialogue(String dialogue) {
    this.dialogue.add(dialogue);
  } // end of addDialogue(String) method

  /**
   * @param state the state for which dialogue is requested.
   * @returns dialogue the dialogue for the state state.
   */
  public String speak(int state) {
    return this.dialogue.get(state);
  } // end of speak(int) method

  /**
   * @returns dialogue the dialogue for the character's current state.
   */
  public String speak() {
    return this.dialogue.get(this.state);
  } // end of speak() method

  /**
   * Changes the state of the character.
   *
   * @param state the new state for the character.
   */
  public void changeState(int state) {
    this.state = state;
  } // end of changeState() method

} // end of class Character
