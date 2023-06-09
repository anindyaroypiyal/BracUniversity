import java.util.Scanner;
public class task20 {
public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String s1 = on.nextLine();
	String s2 = on.nextLine();
	
	char []a1 = s1.toCharArray();
	char []a2 = s2.toCharArray();
	
	char []a3 = new char [a1.length + a2.length];
	int i;
	for(i = 0 ; i < a1.length; i++) {
		a3[i] = a1[i];
	}
	for(int j = i,k = 0 ; j < a3.length; j++,k++) {
		a3[j] = a2[k];
	}
	for(int j = 0 ; j < a3.length; j++) {
		System.out.print(a3[j]);
	}
	
}
}
