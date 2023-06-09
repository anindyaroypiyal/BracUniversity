package lab1v10;

import java.util.Scanner;

public class ques8 {

	public static void main(String[] args) {
    Scanner on = new Scanner(System.in);
   
    
    int []arr = new int[10];
   for (int i = 0 ; i < arr.length;i++) {
	   
	   arr[i] = on.nextInt();  
   }
   
   
   int count;
   for(int i = 0 ; i< arr.length;i++) {
	  count = 0;
	   
	   
   for (int j = 0 ; j < arr.length ; j++) {
	   if(arr[i] == arr[j]) {
		   count++;
		   if (count >= 2 && count < 5) {
			   System.out.println(arr[i]);
	   }
   }
   
   }
   
   }
    
	}
	
}
