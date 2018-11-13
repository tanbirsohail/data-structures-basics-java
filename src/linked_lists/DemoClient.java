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
		
		System.out.println("Appending 0 to the start of the list");
		list.prepend(0);
		list.printList();
		
		System.out.println("The node at the end is having value: "+list.findLastNode().data);
		System.out.println("The length of the list is :"+list.findLength());
		
		list.append(47);
		list.append(22);
		list.append(21);
		
		// Demo circular list property
		System.out.println("Checking if list is circular: "+list.isListCircular());
		LinkedListNode<Integer> tailNode = list.findLastNode();
		
		System.out.println("Latching the tail node to the fourth node in the list");
		tailNode.next = list.getHead().next.next.next;
		
		System.out.println("Checking again if list is circular: "+list.isListCircular());
		System.out.println("Printing the circular start point Node's value : "+list.findCircularStartNode().data);
		
		// Since the list is circular, printing will run into infinite loop
		//list.printList();
	}

}
