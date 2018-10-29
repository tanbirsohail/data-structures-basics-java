package linked_lists;

/*
 * @author Tanbir Sohail
 */
public class LinkedList {
	// Private inner class that holds the data elements.
	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	/**
	 * Gets the head element of the linked list.
	 * @return The head node
	 */
	public Node getHead() {
		return head;
	}
	/**
	 * Adds an element to the end of the list.
	 * @param data The value of the element to be added.
	 */
	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	/**
	 * Adds an element to the beginning of the list.
	 * @param data The value for the node to be added.
	 */
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	/**
	 * Displays the contents of the list.
	 */
	public void displayList() {
		Node iterator = head;
		while (iterator != null) {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}
		System.out.println();
	}

}
