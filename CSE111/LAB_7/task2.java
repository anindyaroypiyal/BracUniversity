import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
	Scanner on = new Scanner (System.in);
	
	String ss = on.nextLine();
	
	int x = on.nextInt();
	
	char []arr = ss.toCharArray();
	
	if(x>=0 && x < arr.length) {
		System.out.println((char)arr[x]);
	}
	else {
		System.out.println("Invalid index");
	}

}
}
