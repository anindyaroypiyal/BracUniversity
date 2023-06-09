import java.util.Scanner;
public class task11 {

	public static void main(String[] args) {
	Scanner on = new Scanner (System.in);
	int flag = 0;
	
	String s1 = on.nextLine();
	String s2 = on.nextLine();
	
	char []up = s1.toCharArray();
	char []up2 = s2.toCharArray();
	
	for(int i = 0 ; i < up.length ; i++){
		if(up[i] > 95) {
			up[i]-=32;
		}
		}
	
	for(int i = 0 ; i < up2.length ; i++){
		if(up2[i] > 95) {
			up2[i]-=32;
		}
		}
	for(int i = 0 ; i < up2.length ; i++) {
		if(up[i] == up2[i]) {
			flag++;
		}
		
	}
	if(flag == up2.length) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	}
}

