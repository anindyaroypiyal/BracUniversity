import java.util.Scanner;
public class PR5 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	int a = 1;
	int count;
	while (a < 10){
	
		String st = on.next();
		char []gh = st.toCharArray();
		int []arr = new int [256];
		
		for(int i = 0 ; i < gh.length ; i++) {
			count = 0;
			for (int j = 0; j < gh.length; j++) {
				if (gh[j] == gh[i]) {
					arr[gh[i]]++;
				}
			}
		}
		for (int k = 0 ; k < arr.length; k++) {
			if (arr[k] > 1 ) {
				System.out.print(gh[k]+" occured " +arr[k] +" times");
				System.out.print("enter another number");
			}
			
			}
			
		}
	}
}
}