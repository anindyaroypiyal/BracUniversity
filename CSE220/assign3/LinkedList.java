package assign3;

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
	              tail.n = n;
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
	      for(Node n = head ; n!= null ; n = n.n){
	          c++;
	      }
	    return c; // please remove this line!
	  }
	  
	  /* prints the elements in the list */
	  public void printList(){
	    // TO DO 
	      for(Node n = head ; n!= null ; n = n.n){
	          System.out.print(n.e +" ");
	          
	      }System.out.println();
	  }
	  
	  // returns the reference of the Node at the given index. For invalid index return null.
	  public Node nodeAt(int idx){
	    // TO DO
	      int i = 0;
	      int flag = 0;
	      Node n;
	      for(n = head ; n != null ; n = n.n, i++){
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
	
	 
	  public Node mergeList (Node head1, Node head2){
		  Node dummyNode = new Node(0, null); 
	      
		    Node tail = dummyNode; 
		    while(tail != null){
		    	
		    	if((int)head1.e <= (int)head2.e) 
		        { 
		            tail.n = head1; 
		            head1 = head1.n; 
		        }  
		        else
		        { 
		            tail.n = head2; 
		            head2 = head2.n; 
		        } 
		    	
		        if(head1 == null) 
		        { 
		            tail.n = head2; 
		            break; 
		        } 
		        if(head2 == null) 
		        { 
		            tail.n = head1; 
		            break; 
		        } 
		        
		        tail = tail.n; 
		    } 
		    return dummyNode.n; 
		} 
	  
	  public boolean search(Node head, Object elem){
		  int flag = 0;
		  for(Node n = head ; n!=null ; n =  n.n) {
			  if(n.e == elem) {
				  flag = 1;
			  }
		  }
		if(flag == 1) {
			return true;
		}
		else return false;
	  
	  }

	public void removeDuplicates(Node head) {
		for(Node n = head ; n!= null ; n=n.n) {
			for(Node x = n; x != null ;) {
//				System.out.println(n.e);
				if((int)n.e == (int)x.e) {
					x = x.n;
				}
				else {
					n.n = x;
					break;
				}
			}
		}	
	}
		  }
	 



