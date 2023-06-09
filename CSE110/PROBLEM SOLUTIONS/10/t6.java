import java.util.Scanner;
public class t6{
  public static void main(String[] args){
  
  Scanner on = new Scanner(System.in);
  System.out.println("give n");
  int n = on.nextInt();
  int max = 0;
  
  int arr[] = new int [5];
  
  for (int i = 0; i < arr.length ; i++){
  arr[i] = on.nextInt();
  }
  
  for (int i = 0; i< arr.length; i++){
  max = i;
  for (int j = i +1; j < arr.length ; j++){
    if (arr[max] < arr[j] ) {max = j;}
    
  }
  int temp = arr[i];
  arr[i] = arr[max];
  arr[max] = temp;
  }
  for (int k = 0 ; k < arr.length ; k++){
    System.out.print(arr[k] +" ");
    
  }System.out.println(n +"th highest number is in " +(n) +"th position in array");
  }
  }