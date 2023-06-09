import java.util.Scanner;
public class t20{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int sum = 0;
    int y =0;
 
    
    for (int i = x; i >= 0 ; i--){
    y = x % 10;
    System.out.print(y +" ");
    x = x / 10;
    i = x;
    
    }
  
  }
}