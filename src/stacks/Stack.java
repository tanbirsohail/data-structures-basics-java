package stacks;

public class Stack<T> {

	private StackNode top;

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
		StackNode<T> node = new StackNode<>(data);
		node.next = top;
		top = node;
	}

	public T pop() {
		T data = (T) top.data;
		top = top.next;
		return data;
	}

	void displayStack() {
		StackNode<T> iterator = top;
		while (iterator != null) {
			System.out.print(iterator.data + " -> ");
			iterator = iterator.next;
		}
		System.out.println();
	}
}
