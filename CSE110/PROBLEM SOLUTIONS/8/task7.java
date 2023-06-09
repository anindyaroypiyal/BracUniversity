import java.util.Scanner;
public class task7 {

	public static void main(String[] args) {
		Scanner on = new Scanner(System.in);
		
		int []arr = new int [10];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = on.nextInt();
			for (int j = 0 ; j <= i ; j++) {
				System.out.print(arr[j] +" ");
			}
		}

	}
}

