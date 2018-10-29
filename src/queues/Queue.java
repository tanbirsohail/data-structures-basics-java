package queues;

public class Queue<T> {

	// Private inner class that holds the data elements.
	@SuppressWarnings("hiding")
	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head; // in FIFO, elements will be removed from here
	private Node<T> tail; // in FIFO, elements will be appended to here

	public boolean isNull() {
		return head == null;
	}

	public T peek() {
		try {
			return (T) head.data;
		} catch (Exception e) {
			System.out.println("Head is null, Queue is empty!");
			return null;
		}

	}
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(tail !=null) {
			tail.next = newNode;
		}
		tail =newNode;
		if(head == null) {
			head = newNode;
		}
	}
	
	public T remove() {
		T data = (T) head.data;
		head = head.next;
		
		if(head == null) {
			tail=null;
		}
		
		return data;
	}
	
	void displayQueue() {
		Node<T> iterator = head;
		while(iterator != null) {
			System.out.print(iterator.data + " -> ");
			iterator = iterator.next;
		}
		System.out.println();
	}

}
