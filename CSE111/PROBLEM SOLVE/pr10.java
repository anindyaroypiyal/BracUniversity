import java.util.Scanner;
public class pr10 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String st1= on.next();
	
	char []cha = st1.toCharArray();
	char[] mst = new char[100];
	int cnt = 0;
	
	for(int i = 0 ; i < cha.length ; i++) {
		if(cha[i] >= 'A' && cha[i] <= 'Z'){
			mst[cnt] = cha[i];
			for (int j = cnt ; j >= 0 ; j--) {
				System.out.print(mst[j]);
			}
			cnt = 0;
		}
		else {
			mst[cnt] = cha[i];
			cnt++;
		}
	}

	}

}
