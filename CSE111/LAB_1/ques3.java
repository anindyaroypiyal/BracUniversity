package lab1v10;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	int []arr = new int [10];
	
	for (int i  = 0 ;i < arr.length; i++) {
		arr[i] = on.nextInt();
	}
	
	for (int i = 0 ; i < arr.length ; i++ ) {
		int minindex = i;
		for (int j = i + 1; j < arr.length ; j++) {
			if (arr[j] > arr[minindex]) {
				minindex = j;
			}
		}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr [i] = temp;
		
	}
	for (int k = 0 ; k < arr.length; k++) {
		System.out.print(arr[k] +" ");
	}
	}

}
