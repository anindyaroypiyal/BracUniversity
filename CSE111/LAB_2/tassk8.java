
import java.util.Scanner;
public class tassk8 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);

	int []arr = new int [10];
	
	arr[0] = on.nextInt();
	for (int i = 1 ; i < arr.length ; ) {
		int x = on.nextInt();
		int ar = 0;
		for (int j = 0 ; j < i ; j++) {
			if (x == arr[j]) {
				ar++;
			}
		}
			if (ar != 0) {System.out.print("Duplicate");}
			else {
				arr[i] = x;
				i++;
			}
	}
	
	}
	}

