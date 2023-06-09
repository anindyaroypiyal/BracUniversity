import java.util.Scanner;
public class t17{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int temp;
    System.out.println("enter number of inputs");
    int x = on.nextInt();
    int arr[] = new int[x];
    for (int i = 0; i < arr.length; i++)
    {
     arr[i] = on.nextInt();
    }
    boolean fix = false;
    while(fix == false) {
      fix = true;
    for (int i = 0 ; i < arr.length-1; i++){
       {
 
         if (arr[i]>arr[i+1]){
         temp = arr[i+1];
         arr[i+1] = arr[i];
         arr[i] = temp;
         
         fix = false;
         }
       } 
    }
    } 
    if (x % 2 != 0 ) {int med = (x+1)/2;
    System.out.println("Median is : "+arr[med-1]);
    }
    else {int m = (x/2);
      int med = (arr[m-1] + arr[m]) / 2;
    System.out.println("Median is : "+med);
         }

  }
}