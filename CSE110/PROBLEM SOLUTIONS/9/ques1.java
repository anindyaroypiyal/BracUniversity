package lab1v10;
import java.util.Scanner;
public class ques1 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	int []arr = new int[10];
	
	for (int i = 0 ; i < arr.length ; i++) {
		arr[i] = on.nextInt();
		
	}
	for (int j = arr.length - 1; j >= 0 ; j--) {
		System.out.print(arr[j] +" ");
	}

	}

}
