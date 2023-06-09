import java.util.Scanner;
public class t20{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int temp,ar=0;
    String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
   
    System.out.println("enter a number");
    
    int a = on.nextInt();
    
    for (int i = 0; i< arr.length; i++){
      if (a == i) {System.out.println(arr[i]);
      }
    }
    
  }
}