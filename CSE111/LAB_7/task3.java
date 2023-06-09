import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
	Scanner on = new Scanner (System.in);
	
	String s1 = on.nextLine();
	String s2 = on.nextLine();
	
	char[]a1 = s1.toCharArray();
	char[]a2 = s2.toCharArray();
	
	int flag = 0;
	for(int i = 0 ; i < a2.length ; i++) {
		if(a2[i]==a1[i]) {
			flag++;
			}
		}
	if(flag == a2.length) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	}
}

