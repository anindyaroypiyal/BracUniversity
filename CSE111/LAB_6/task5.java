import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
	Scanner on = new Scanner(System.in);
	
	String ss = on.next();
	
	int []arr = new int [200];
	
	for (int i = 0 ;i < ss.length() ; i++) {
	arr[ss.codePointAt(i)]++;
	}

	
	int maxIndx = 65;
	for(int i = 0 ; i < 2 ; i++) {
		
		
		for (int j = 65 ; j < 91 ; j++) {
			if(arr[j]>arr[maxIndx]) {

				maxIndx = j;
			}
			
		}
		arr[maxIndx] = 0;
	}
	System.out.println((char)maxIndx);	
	}
	}

