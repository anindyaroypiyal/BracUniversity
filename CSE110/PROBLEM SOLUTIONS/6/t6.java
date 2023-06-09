import java.util.Scanner;
public class t6{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter value of n");
    int x = on.nextInt();
    int sum = 0 ;
    
    for (int i = 1 ; i <= x ; i++) {
      if (i % 2 == 0) {sum = sum - (i*i);}
      else {sum += (i*i);}
    }
  System.out.println("y = "+sum);
  }
}