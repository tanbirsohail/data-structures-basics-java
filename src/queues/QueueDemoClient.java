package queues;

public class QueueDemoClient {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<>();

		queue.add("Foo");
		queue.add("Bar");
		queue.add("Bat");
		queue.add("Baz");

		System.out.println("The queue is : ");
		queue.displayQueue();

		// Removing an element
		System.out.println("Removing an element.");
		String element = queue.remove();
		System.out.println("The removed element is : " + element);
		System.out.println("The queue is : ");
		queue.displayQueue();

		// Removing an element
		System.out.println("Peeking the queue.");
		String element2 = queue.peek();
		System.out.println("The peek returned the element : " + element2);
		System.out.println("The queue is : ");
		queue.displayQueue();

	}

}
