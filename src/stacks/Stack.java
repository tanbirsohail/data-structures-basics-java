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
		try {
			return (T) top.data;
		} catch (Exception e) {
			System.out.println("Head is null, Queue is empty!");
			return null;
		}

	}
	
	public void push(T data) {
		Node<T> node = new Node<>(data);
		node.next = top;
		top = node;
	}
	
	public T pop()	{
		T data = (T) top.data;
		top = top.next;
		return data;
	}
}
