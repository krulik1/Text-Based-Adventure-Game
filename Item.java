/**
 * title: Item.java
 * description: Item class is used to instantiate objects of the type Item.
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

public class Item {
  String name;
  String description;
  int state;
  //Use use;

  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String toString() {
  return name;
}

  public String getName() {
	  return name;
  }

  public String description() {
    return description;
  }

  public void changeState(int state) {
    this.state = state;
  }
} // end of class Item
