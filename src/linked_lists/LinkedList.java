package linked_lists;

/*
 * @author Tanbir Sohail
 */
public class LinkedList<T> {

	private LinkedListNode<T> head;
	/**
	 * Gets the head element of the linked list.
	 * @return The head node
	 */
	public LinkedListNode<T> getHead() {
		return head;
	}
	/**
	 * Adds an element to the end of the list.
	 * @param data The value of the element to be added.
	 */
	public void append(T data) {
		if (head == null) {
			head = new LinkedListNode<T>(data);
			return;
		}
		LinkedListNode<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new LinkedListNode<T>(data);
	}
	/**
	 * Adds an element to the beginning of the list.
	 * @param data The value for the node to be added.
	 */
	public void prepend(T data) {
		LinkedListNode<T> newHead = new LinkedListNode<T>(data);
		newHead.next = head;
		head = newHead;
	}
	/**
	 * Displays the contents of the list.
	 */
	public void printList() {
		LinkedListNode<T> iterator = head;
		while (iterator != null) {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}
		System.out.println();
	}

}
