import java.util.Scanner;
public class str4 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String wrd = on.nextLine();
	

	int arr[] = new int [256];
	
	
		for (int j = 0 ; j < wrd.length(); j++) {
			arr[wrd.codePointAt(j)]++;
		}
	for (int i = 0 ; i < arr.length; i++) {
		if (arr[i] > 0) {
			System.out.println((char)i +" which is " +i +" was found "+ arr[i] +"times");
		}
	}

	}

}
