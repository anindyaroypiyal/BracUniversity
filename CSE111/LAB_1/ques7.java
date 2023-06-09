package lab1v10;
import java.util.Scanner;

public class ques7 {

	public static void main(String[] args) {
    Scanner on = new Scanner(System.in);
    
    int []arr = new int[11];
    
    arr[0] = on.nextInt();
    
    for (int i = 1; i< arr.length;) {
    	int x = on.nextInt();
    	int ar = 0;
    	
    for (int j = 0 ; j < i; j++) {
    	
    	if(x == arr[j]) {
    		ar++;
    	}
    }
    	if (ar > 3) {
    		System.out.println("Duplicate");
    	}
    	else {
    		arr[i] = x;
    		i++;
    	}
    }
	}
	
}
