
public class removeOdd {
	public static int [] removeOdd (int []input){
		int arr[] = new int [100];
		for (int i = 0 ; i < input.length;i++) {
			if(input[i] % 2 == 0) {
				for(int j = 0 ; j < 100 ; j++) {
				arr[j] = input[i];
				}
			}
		}
	return arr;  
	}
	

}
