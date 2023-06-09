package assign3;

public class task2 {
	public static void main(String[] args) {
		
		
		Object [] a1 = {1,1,1,2,3,3,4,5,6};
	    LinkedList h1 = new LinkedList(a1); // Creates a linked list using the values from the array
	    
	    h1.printList();
	    h1.removeDuplicates(h1.head);
	    h1.printList();
		
//		Object [] a1 = {0,1,5,7,9};
//		LinkedList h1 = new LinkedList(a1);
//		Object [] a2 = {0,2,3,5,9};
//		LinkedList h2 = new LinkedList(a2);
//		
//		h2.head = h2.mergeList(h1.head, h2.head);
//		h2.printList();
		
//		Object []a4 = {1,2,5,1};
//		LinkedList g1= new LinkedList(a4);
//		System.out.println(g1.search(g1.head, 3));
	}
	
	
}
