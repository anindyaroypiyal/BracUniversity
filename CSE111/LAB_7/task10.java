import java.util.Scanner;
public class task10 {
	public static void main(String[] args) {
		
		Scanner on = new Scanner(System.in);
		int flag = 0;
		String s1 = on.nextLine();
		String s2 = on.nextLine();
		
		char []a1 = s1.toCharArray();
		char []a2 = s2.toCharArray();
		
		for(int i = 0 ; i < a2.length ; i++) {
			if(a1[i] == a2[i]) {
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
