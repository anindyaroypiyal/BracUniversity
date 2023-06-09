package lab2;

public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start = st;
    size = sz;
    cir = new Object[lin.length];
    int pos = st;
    for(int i = 0 ; i < sz ; i++){
        cir[pos] = lin[i];
        pos = (pos+1)%cir.length;
    }   
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
      for(int i = 0 ; i < cir.length ; i++){
          System.out.print(cir[i]+" ");
      }  System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
      
     int st = start;
     for(int i = 0 ; i < size ; i++){
    	 if(cir[st] != null) {
          System.out.print(cir[st]+" ");
           }
    	 st = (st+1)%cir.length;
     }
      System.out.println();
  }
  
  
  public void printBackward(){
      int end = (start + size - 1)% cir.length;
   for(int i = 0 ; i < size ; i++){
       System.out.print(cir[end]+" ");
       end--;
   if(end < 0){
       end = cir.length -1;
   }
          
          
      }
  }
  
  // With no null cells
  public void linearize(){
   Object []temp = new Object[cir.length];
   int pos = start;
   for(int i = 0 ; i<size ;i++ ){
       temp[i] = cir[pos];
       pos = (pos+1)%cir.length;
             
   }
   cir = temp;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
  
    Object blue[]=new Object[newcapacity];
        int st=start;
        
        for(int i=0;i<cir.length;i++){
            
            blue[st]=cir[st%cir.length];
            
            st++;
            
        }
        cir=blue;
        
    
  }

  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
  
   Object []temp = new Object[newcapacity];
   int pos = start;
   for(int i = 0 ; i<size ;i++ ){
       temp[i] = cir[pos];
       pos = (pos+1)%cir.length;
             
   }
   cir = temp;
  }
  public void insertByRightShift(Object elem, int pos){
    

    if (size == cir.length) {
    	Object blue[]=new Object[cir.length + 3];
        int st=start;
        
        for(int i=0;i<cir.length;i++){
            
            blue[st]=cir[st%cir.length];
            
            st++;
            
        }
        cir=blue;
    }
  
    int nshift = size - pos;
    int end  = (size + start )%cir.length;
    for(int i = 0 ; i < nshift ; i++) {
    	cir[end] = cir[end-1];
    	end--;
    	if(end < 0) {
    		end = cir.length -1;
    	}
    }
   cir[start+pos] = elem;

   size++;
   
  }

  
  
  public void insertByLeftShift(Object elem, int pos){
	  if (size == cir.length) {
	    	Object blue[]=new Object[cir.length + 3];
	        int st=start;
	        
	        for(int i=0;i<cir.length;i++){
	            
	            blue[st]=cir[st%cir.length];   
	            st++;  
	        }
	        cir=blue;
	    }
	  
    int nshift = size - pos;
    
    for(int i = 0 ; i < nshift ; i ++) {
    	cir[i] = cir[i+1];
    }
    cir[start + pos] =elem;
    start--;
    size++;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    int nshift = size - pos;
    for(int i = 0 ; i < nshift ; i ++) {
    	cir[(start + pos)%cir.length] = cir[(start + pos +1)%cir.length];
    	cir[(start + pos+1)%cir.length] = null;
    	pos++;
    }
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
	  int nshift = pos;
	  int spoint= (start + pos)%cir.length;
	  for(int i = 0 ; i < nshift ; i++) {
		  cir[spoint] = cir[spoint - 1];
		  cir[spoint - 1] = null;
		  spoint--;
		  if((spoint) < 0) {
			  spoint = cir.length - 1;
		  }
		  
	  }
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
	  int i = start , j = (start + size - 1)% cir.length;
	  int flag = 0;
    for(i= start; i < (start+size+1)/2 ; i++,j--) {
    	System.out.println(cir[i]);
    	System.out.println(cir[j]);
    	if(j < 0) {
    		j = cir.length -1;
    	}
    	if(cir[i%cir.length] != cir[j]) {
    		flag = 1;
    	}
    	}
    if(flag == 0) {
		System.out.println("This array is a palindrome");
	}
	else {
		System.out.println("This array is NOT a palindrome");
	}
  }

  
	 public void sort() {
		 int st = start;
		 
		 for(st = start  ; st < (st+size) ; st++) {
			 if(st >= cir.length) {
				 st = (st%cir.length);
			 }
			 int min = (int)cir[st];
//			 System.out.println(min);
			 int minID = st;
			 for(int j = 0 ; j < size ; j++) {
				 int pos = (st)%cir.length;
			
				if((int)cir[pos] < min) {
					min = (int)cir[pos];
					minID = pos;
					pos = (pos+1)%cir.length;
				}
			 }
			 
			 int temp =(int) cir[st];
			 cir[st] = min;
			 cir[minID] = temp;
		 }
	 }


public void palindromeCheck2(int [] cir, int start, int size){
	  int i = start , j = (start + size - 1)% cir.length;
	  int flag = 0;
  for(i= start; i < (start+size+1)/2 ; i++,j--) {
  	System.out.println(cir[i]);
  	System.out.println(cir[j]);
  	if(j < 0) {
  		j = cir.length -1;
  	}
  	if(cir[i%cir.length] != cir[j]) {
  		flag = 1;
  	}
  	}
  if(flag == 0) {
		System.out.println("This array is a palindrome");
	}
	else {
		System.out.println("This array is NOT a palindrome");
	}
}
}