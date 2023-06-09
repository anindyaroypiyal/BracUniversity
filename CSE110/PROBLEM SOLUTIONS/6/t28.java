import java.util.Scanner;
public class t28{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int count = 0;
    int sum = 0;
 
    for (int i = 1; i <= x ; i++){
      if (x % i == 0) {count++;
      sum = sum + i;
      }
      
    }
       
          System.out.println(sum);
  }
}