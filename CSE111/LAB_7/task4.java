import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
	Scanner on = new Scanner (System.in);
	
	String s1 = on.nextLine();
	String s2 = on.nextLine();
	char[]a1 = s1.toCharArray();
	char[]a2 = s2.toCharArray();
	
	
	int flag = 0;
	for(int i = a1.length-1,j = a2.length-1 ; j >= 0 ; i--,j--) {
		if(a2[j]==a1[i]) {
			flag++;
			}
		}
//	System.out.println(flag);
	if(flag == a2.length) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	}
}