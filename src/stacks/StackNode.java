package stacks;

public class StackNode<T> {
	T data;
	StackNode<T> next;

	StackNode(T data) {
		this.data = data;
	}
}
