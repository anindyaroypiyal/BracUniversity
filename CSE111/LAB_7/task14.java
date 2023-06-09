import java.util.Scanner;
public class task14{
	public static void main(String[] args) {
		Scanner on = new Scanner(System.in);
		int flag = 0;
		
		String s1 = on.nextLine();
		char []a1 = s1.toCharArray();
		int x = on.nextInt();
		
		if(x >= 0 &&x < a1.length) {
		for(int i = x ; i < a1.length ; i++) {
			System.out.print(a1[i]);
		}
	}	
}
}