package stacks;

public class StackDemoClient {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("Foo");
		stack.push("Bar");
		stack.push("Bat");
		stack.push("Baz");

		System.out.println("The stack is : ");
		stack.displayStack();

		// Removing an element
		System.out.println("Removing an element.");
		String element = stack.pop();
		System.out.println("The popped element is : " + element);
		System.out.println("The stack is : ");
		stack.displayStack();

		// Peeking an element
		System.out.println("Peeking the stack.");
		String element2 = stack.peek();
		System.out.println("The peek returned the element : " + element2);
		System.out.println("The stack is : ");
		stack.displayStack();
	}
}
