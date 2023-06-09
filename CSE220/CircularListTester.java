public class CircularListTester {
    public static void main(String[] args) {
        System.out.println("\n/////  Test 01  /////");
        int[] a1 = {40,50,10,20,30};
        CircularList h1 = new CircularList(); // Creates a linked list using the values from the array
        // head will refer to the Node that contains the element from a[0]
        h1.buildFromArray(a1, 2, 5);
        
        h1.printList(); // This should print: 10,20,30,40. 
        
        System.out.println("\n//////  Test 02  /////");
        Object [] b1 = {10,20,30,40};
        LinkedList h2 = new LinkedList(b1);
        h1.buildFromList(h2.head);
        h1.printList();
        
        System.out.println("\n//////  Test 03  /////");
        Object [] a2 = {10,20,30,40};
        LinkedList h3 = new LinkedList(a2);
        h1.buildReverse(h3.head);
        h1.printList();
        
        System.out.println("\n//////  Test 03  /////");
        Object [] a3 = {10,20,30,40};
        LinkedList h4 = new LinkedList(a3);
        h4.printList();
        System.out.println(h1.nodeAt(3).element);
        
        System.out.println("\n//////  Test 04  /////");
        int [] a4 = {40,10,20,30};
        CircularList h5 = new CircularList(); // uses the first constructor: LinkedList(Object [] a)
        h5.buildFromArray(a4,1,4);
        h5.printList(); // This should print: 10,20,30,40.  
    
        // inserts Node containing the given element at the given index. Check validity of index.
        h5.addElement(85,0);
        h5.printList(); // This should print: 85,10,20,30,40.  
        h5.addElement(95,3);
        h5.printList(); // This should print: 85,10,20,95,30,40.  
        h5.addElement(75,6);
        h5.printList(); // This should print: 85,10,20,95,30,40,75. 
        
        System.out.println("\n/////  Test 11  /////");
        int [] a5 = {60,70,10,20,30,40,50};
        CircularList h6 = new CircularList();
        h6.buildFromArray(a5,2,7);
        /* removes Node at the given index. returns element of the removed node.
         * Check validity of index. return null if index is invalid.
         */

        h6.deleteElement(0); // This should print: Removed element: 10
        h6.printList(); // This should print: 20,30,40,50,60,70.  
        h6.deleteElement(3); // This should print: Removed element: 50
        h6.printList(); // This should print: 20,30,40,60,70.  
        h6.deleteElement(4); // This should print: Removed element: 70
        h6.printList(); // This should print: 20,30,40,60. 


    }
}