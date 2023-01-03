/**
 * title: DLList.java
 * description: Data structure that implements a generic doubly-linked list.
 * Pseudocode algorithm modified from Open Data Structures by Pat Morin
 * (print version) Pg. 67-70
 * Link to web version: https://opendatastructures.org/
 * date: 07/09/2022
 * @author 3509416 Jakub Krulik
 * @version 01
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

public class DLList<T> {

	/**
	 * Nested class that defines a node.
	 */
	@SuppressWarnings("hiding")
	class Node<T> {
		T x;
		Node<T> prev, next;
	} // End of class Node

	/** Attributes: */
	int n; // length of the DLList
	Node<T> dummy; //Dummy node that prevents occurance of certain edge cases.

	/**
	 * Constructor that instantiates a new DLList
	 */
	DLList() {
		dummy = new Node<T>();
		dummy.next = dummy;
		dummy.prev = dummy;
		n = 0;
	} // End of method DLList()

	/**
	 * @returns n the size of the list.
	 */
	public int size() {
		return n;
	}

	/**
	 * Searches for the node at index i and returns that node.
	 *
	 * @returns p the node at index i.
	 */
	public Node<T> getNode(int i) {
		Node<T> p = null;
		if (i < n / 2) {
			p = dummy.next;
			for (int j = 0; j < i; j++) {//this one is correct
				p = p.next;
			}
		} else {
			p = dummy;
			for (int j = n; j > i; j--) {
				p = p.prev;
			}
		}
		return p;
	} // End of method getNode(i)

	/**
	 * Searches for a node using getNode() and returns the data value stored.
	 *
	 * @returns x the value stored at node of index i.
	 */
	public T get(int i) {
		return getNode(i).x;
	} // End of method get(i)

	/**
	 * Searches for a node using getNode() and changes the data value contained.
	 *
	 * @returns y the value previously stored at i.
	 */
	public T set(int i, T x) {
		Node<T> u = getNode(i);
		T y = u.x;
		u.x = x;
		return y;
	} // End of method set(i, x)

	/**
	 * Creates a new node with the data element x before the node w.
	 *
	 * @param w node to be added.
	 * @param x new data element.
	 * @returns u the added node.
	 */
	public Node<T> addBefore(Node<T> w, T x) {
		Node<T> u = new Node<T>();
		u.x = x;
		u.prev = w.prev;
		u.next = w;
		u.next.prev = u;
		u.prev.next = u;
		n++;
		return u;
	} // End of addBefore(w, x) method

	/**
	 * Searches for a node index i using getNode() and adds a node storing x
	 * before it.
	 *
	 * @param i index to add an element at.
	 * @param x data element to be added at index i.
	 * @returns x the value stored at node of index i.
	 */
	public void add(int i, T x) {
		addBefore(getNode(i), x);
	} // End of add(i, x) method

	/**
	 * Removes all references from node w.
	 *
	 * @param w the node to be removed.
	 */
	public void remove(Node<T> w) {
		w.prev.next = w.next;
		w.next.prev = w.prev;
		n--;
	} // End of remove(w) method

	/**
	 * Searches for a node w using getNode() and uses remove(Node<T>) to delete
	 * all references to w.
	 *
	 * @param i the index of the node to be removed.
	 * @returns x the value stored at node w.
	 */
	public T remove(int i) {
		Node<T> w = getNode(i);
		remove(w);
		return w.x;
	} // End of remove(i) method

	/**
	 * Implementation of the LIFO operation remove()
	 *
	 * @returns x the data value being removed.
	 */
	public T remove() {
		return remove(0);
	} // end of the remove() method

	/**
	 * Prints the contents of the DLList.
	 *
	 * @returns s string with a textual representation of data stored in the DLList.
	 */
	public String print() {
		StringBuilder print = new StringBuilder();
		print.append("[");
		for (int i = 0; i < n; i++) {
			print.append(get(i));
			if (i != n-1) {
				print.append(", ");
			}
		}
		print.append("]");

		return print.toString();
	} // end of method print()

} // End of class DLList
