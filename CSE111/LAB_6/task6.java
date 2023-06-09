import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		
		int len = 0;
		int k = 0;
		Scanner on = new Scanner(System.in);
		
		
		System.out.println("write size of array");
	
		int x = on.nextInt();
		
		int []arr = new int [x];
		
		for(int i = 0 ; i < x ; i++) {
			arr[i] = on.nextInt();
		}
		
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] > 0) {
				len++;
			}
	}
		int []arr2 = new int [len];
		
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] > 0) {
				arr2[k] = arr[j];
				k++;
			}
		}
	for(int i = 0 ; i < arr2.length ; i++) {
		System.out.print(arr2[i] +" ");
	}
}
}
