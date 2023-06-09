import java.util.Scanner;
public class t19{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int temp,ar=0;
    int arr[] = new int[10];
    for (int i = 0; i < arr.length; i++)
    {
     arr[i] = on.nextInt();
    }
    for(int j = 0 ; j < arr.length ; j = j+2){
      
    System.out.print(arr[j]+",");
    
    }
    
    for (int k = 1 ; k < arr.length ; k = k+2){
      if (ar == 1){System.out.print(",");}
    System.out.print(arr[k]);
    ar = 1;
    }
  }
}