package linked_lists;

public class DemoClient {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		// adding some elements
		list.append(21);
		list.append(42);
		list.append(84);
		
		System.out.println("Displaying the list : ");
		list.printList();
		
		System.out.println("Appending 99 to the end of the list");
		list.append(99);
		list.printList();
		
		System.out.println("Appending 99 to the start of the list");
		list.prepend(99);
		list.printList();
		
	}

}
