import java.util.Scanner;
public class t5{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter value of n");
    int x = on.nextInt();
    int sum = 0;
    
    for (int i = 1 ; i <= x ; i++){
    sum = sum + (i*i*i);
    }
  System.out.println("Y^3 = "+sum);
  }
}