package linked_lists;

/*
 * @author Tanbir Sohail
 */
public class LinkedList<T> {

	private LinkedListNode<T> head;

	/**
	 * Gets the head element of the linked list.
	 * 
	 * @return The head node
	 */
	public LinkedListNode<T> getHead() {
		return head;
	}

	/**
	 * Adds an element to the end of the list.
	 * 
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
	 * 
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

	public LinkedListNode<T> findLastNode() {
		LinkedListNode<T> current = this.head;
		if (current == null) {
			return null;
		}
		while (current.next != null) {
			current = current.next;
		}

		return current;
	}

	public LinkedListNode<T> findCircularStartNode() {

		LinkedListNode<T> slowRunner = this.head;
		LinkedListNode<T> fastRunner = this.head;

		// finding the collision point, will give the circular point in K iterations
		while (fastRunner != null && fastRunner.next != null) {
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;

			if (fastRunner == slowRunner) {
				break;
			}
		}
		// now we are at collision point check if list has
		// reached endpoint and hence is linear, no loop
		if (fastRunner == null || fastRunner.next == null) {
			return null;
		}

		// setting to head to meet at collision point
		slowRunner = this.head;
		while (slowRunner != fastRunner) {
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next;
		}
		return fastRunner;
	}
	
	public boolean isListCircular() {
		LinkedListNode<T> current = this.findCircularStartNode();
		
		return current != null;
	}

	public int findLength() {
		int length = 0;
		if (this.head == null) {
			return length;
		}
		LinkedListNode<T> current = this.head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

}
