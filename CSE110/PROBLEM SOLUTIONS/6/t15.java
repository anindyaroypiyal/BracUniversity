import java.util.Scanner;
public class t15{
  public static void main (String[] args) {
    
    Scanner on = new Scanner(System.in);
    System.out.println("enter value of n");
    int n = on.nextInt();
    int sum = 0;
    
    for (int x = 1 ; x <= n ; x++){
      for (int j = 1 ; j <= x; j++){
        sum = sum + j;
      }
    }
  System.out.println(sum);
  }
}