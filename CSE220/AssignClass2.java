
public class AssignClass2 {
	public static void main(String [] args){
		int []s = {5,4,3,2,1,0,0,0,1,2,3,4} ;
		palindromeCheck2(s , 8 , 9);
		int []a = {1,2,5,6,4,0,0,1,1,2,3,1} ;
		int n = 1;
		remove (a, 7, 10, 1);
 	}

public static void palindromeCheck2(int [] cir, int start, int size){
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

public static void remove (int [] cir, int start, int size, int elem) {
//	for(int i = 0 ; i < size; i++) {
//		if(cir[i] == elem) {
//			cir[i] = 0;
//		}
//		
//	}
	for(int i = start; i < (start+size) ; ) {
	int j;
	 if(cir[i%cir.length] == elem) {
		 for(j = i ; j < start+size ; j++) {
		 cir[j%cir.length] = cir[(j+1)%cir.length];	
	 }
		 }
	 if(cir[i%cir.length] != elem) {
		 i++;
	 }
	}
	
	for(int i = 0 ; i < cir.length ; i++) {
		System.out.print(cir[i]+" ");
	}
}


}