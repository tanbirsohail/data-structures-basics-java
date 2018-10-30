package stacks;

public class Stack<T> {
	// Private inner class that holds the data elements.
	@SuppressWarnings("hiding")
	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node top;

	public boolean isNull() {
		return top == null;
	}

	public T peek() {
		if (top.data != null) {
			return (T) top.data;
		} else {
			System.out.println("Head is null, Stack is empty!");
			return null;
		}

	}

	public void push(T data) {
		Node<T> node = new Node<>(data);
		node.next = top;
		top = node;
	}

	public T pop() {
		T data = (T) top.data;
		top = top.next;
		return data;
	}

	void displayStack() {
		Node<T> iterator = top;
		while (iterator != null) {
			System.out.print(iterator.data + " -> ");
			iterator = iterator.next;
		}
		System.out.println();
	}
}
