import java.util.Scanner;
public class t25{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int count=0;
  
    for (int i = 1 ; i <= x ; i++){
      if (x % i == 0){count++;}
    }
  System.out.println(count +" times divisible");
  }
}