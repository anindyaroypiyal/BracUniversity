import java.util.Scanner;
public class task12{
	public static void main(String[] args) {
		Scanner on = new Scanner(System.in);
		int flag = 0;
		
		String s1 = on.nextLine();
		String s2 = on.nextLine();
		
		char []a1 = s1.toCharArray();
		char []a2 = s2.toCharArray();
		
		for (int i = 0 ; i < a1.length ; i++) {
			flag = a1[i]-a2[i];
			if(flag != 0) {
				break;
			}
		}
		System.out.println(flag);
	}
}