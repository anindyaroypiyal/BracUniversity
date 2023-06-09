public class CircularList{
  Node head;
  
  /* Build  Circular List from the given circular array
   */
  public void buildFromArray(int[]cir,int st,int size){
    head = new Node(cir[st] , null);
    Node tail = head;
    int pos = st;
    for(int i = 1; i < size-1 ; i++) {
    	Node x = new Node (cir[(pos+1)%cir.length], null);
    	tail.next = x;
    	tail = tail.next;
    	pos = (pos+1)%cir.length ;
  }
    tail.next = head;
  }
  /* Build a Circular List from the given Non Dummy Headed Non Circular List 
   */
  public void buildFromList(Node h){
    this.head = h;
  }
  
  /* Build a Circular List from the given Non Dummy Headed Non Circular List
   * The elements of the new list must in reverse order
   */
  public void buildReverse(Node h){
    Node newHead = new Node((int)h.element , null);
    for(Node cur = h.next ; cur!=null ; cur = cur.next) {
    	newHead = new Node((int)cur.element , newHead);
  }
    head = newHead;
    buildFromList(head);
  }
  
  /* Insert the element in the given index.
   * Index 0 is the index of the head
   */ 
  public void addElement(int element, int index){
  int i = 0;
	  
	  for(Node n = head ; n!=null ; n =  n.next , i++) {
		  if(i == index) {
			  if(index == 0) {
				  Node x = new Node(element , head);
				  head =  x;
				  
			  }
		  }
			  if(i == index - 1) {
			   Node a = new Node(element,n.next);
		       n.next = a;
			  }
		  }
	}
  
  
  /* Delete the element from the given index.
   * Index 0 is the index of the  head
   */ 
  public void deleteElement(int index){
	  int i = 0;
	  for (Node n = head ; n != null ; n =  n.next , i++) {
		  
			  if(index == 0) {
				  
			  head = head.next;
			  break;
			  }
			  if(i == index - 1) {
				 
				  n.next = n.next.next;
				  break;
			  }
		  }
  }

public void printList(){
    // TO DO 
	Node n;
      for(n = head ; n.next != head ; n = n.next){
    	  if(n != null) {
          System.out.print(n.element +" ");
    	  }
      }System.out.println(n.element);
  }
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
}