import java.util.Scanner;
public class task19 {
public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	int flag = 0;
	
	String s1 = on.nextLine();
	String x = on.next();
	int v = on.nextInt();
	
	char []a = s1.toCharArray();
	char []x1 = x.toCharArray();
	int i;
	for (i = a.length -1 ; i >= v;i--) {
		if(x1[0] == a[i]) {
			flag = 1;
			break;
		}
	}
	if(flag == 1) {
		System.out.println(i);
	}else {
		System.out.println("-1");
	}
}
}
