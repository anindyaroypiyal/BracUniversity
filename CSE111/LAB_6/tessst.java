
public class tessst {
	public static void main(String [] args){
	    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
	    for (int i = 0; i < mixedArray.length; i++) {
	      System.out.print(mixedArray[i] + " ");
	    }
	    System.out.println();
	    int [] noOdd = removeOdd(mixedArray);
	    for (int i = 0; i < noOdd.length; i++) {
	      System.out.print(noOdd[i] + " ");
	    }    
	  }

static int j = 0;
static int len = 0;
public static int [] removeOdd (int []input){

	
	for (int i = 0 ; i < input.length;i++) {
		if(input[i] % 2 == 0) {
			len++;
		}
	}
		int arr[] = new int [len];
	for (int k = 0 ; k < input.length;k++) {
		if(input[k] % 2 == 0) {
			 
			arr[j] = input[k];
			j++;
	}
	}
		return arr;  
}
}