import java.util.Scanner;
public class task9 {

	public static void main(String[] args) {
		Scanner on = new Scanner (System.in);
		int []arr = new int [10];
		
		for (int i = 0 ; i < arr.length;i++) {
			arr[i] = on.nextInt();
			
		}
		
		for(int j = 0 ; j < arr.length ; j = j+2) {
			System.out.print(arr[j] +",");
		}
		for (int j = 1; j< arr.length;j = j+2) {
		if(j != 1) {
			System.out.print(",");
		}
		System.out.print(arr[j] );
		}
		System.out.print(".");

	}

}
