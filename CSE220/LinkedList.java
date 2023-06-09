public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
      Node tail = null;
      for(int i = 0 ; i < a.length ;i++){
          Node n = new Node(a[i],null);
          if(head == null){
              head = n;
              tail = n;
          }
          else{
              tail.next = n;
              tail = n;
          }
      }
      
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
     this.head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
      int c = 0;
      for(Node n = head ; n!= null ; n = n.next){
          c++;
      }
    return c; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO 
      for(Node n = head ; n!= null ; n = n.next){
          System.out.print(n.element +" ");
          
      }System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
      int i = 0;
      int flag = 0;
      Node n;
      for(n = head ; n != null ; n = n.next, i++){
          if(i==idx){
              
              flag = 1;
              break;
          }
          
      }
     if(flag == 1){
         return n;
     }
     else  return null;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
      int i = 0;
      Node n;
      for(n = head ; n != null ; n = n.next, i++){
          if(i==idx){  
            break;
          }
      }
      return n.element ;
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
      int i = 0 , flag = 0, x = 0;
      Node n;
      for(n = head ; n!= null ; n = n.next, i++){
          if(i == idx){
              x = (int)n.element;
              n.element = elem;
              flag = 1;
          }
      }
      if(flag == 1)
    return x; 
      else return null;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
      int i = 0 , flag = 0 ;
      Node n;
      for(n = head ; n!= null ; n = n.next, i++){
        if (n.element == elem){
            flag = 1;
           break; 
        }  
      }
      if(flag == 1){
          return i;
      }else
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
      int i = 0 , flag = 0 ;
      Node n;
      for(n = head ; n!= null ; n = n.next, i++){
        if (n.element == elem){
            flag = 1;
        }
         // please remove this line!
  }
      if(flag == 1) return true;
        else
    return false;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
	  Node n;
	  Node chead = null;
	  Node ctail = null;
	  for(n = head ; n != null ; n = n.next) {
		  
		  if(chead == null) {
			  chead = n;
			  ctail = n;
		  }
		  else {
			  ctail.next = n;
			  ctail = n;
		  }
	  }
	  head = chead;
    return head; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
	Node n = head;
	Node tail = new Node(head.element , null);
	  
	for(n = head.next ; n!=null ; n = n.next) {
	 tail =new Node (n.element,tail);
	 
	}

    return tail; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
	  int i = 0;
	  
	  for(Node n = head ; n!=null ; n =  n.next , i++) {
		  if(i == idx) {
			  if(idx == 0) {
				  Node x = new Node(elem , head);
				  head =  x;
				  
			  }
		  }
			  if(i == idx - 1) {
			   Node a = new Node(elem,n.next);
		       n.next = a;
			  }
		  }
	}
	  

  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
	  int i = 0, a = 0;
	  for (Node n = head ; n != null ; n =  n.next , i++) {
		  
			  if(index == 0) {
				  a = (int) head.element;
			  head = head.next;
			  break;
			  }
			  if(i == index - 1) {
				  a = (int)n.next.element;
				  n.next = n.next.next;
				  break;
			  }
		  }
	  
    return a; // please remove this line!
}
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO

	  Node a = new Node(head.element , null);
	  head = head.next;
	  
	  for(Node n = head ; n!=null ; n = n.next) {
		  
	  if(n.next == null) {
		  n.next = a;
		  break;
		  }
	  }
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
	  int a = 0;
	  for(Node n = head ; n!=null ; n = n.next) {
		  if(n.next.next ==  null) {
			a = (int)n.next.element; 
			n.next = null;
		  }
	  }
	  Node s = new Node(a,head); 
		  head = s;
	  }
  }
  