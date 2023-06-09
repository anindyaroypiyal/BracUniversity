import java.util.Scanner;
public class t5 {
  public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    for (int i =1 ; i <= 20 ; i++) {
    System.out.println("Enter number");
      int num = on.nextInt();
      if (num % 2 == 0) {System.out.println("even");}
      else {System.out.println("odd");}
    }
  }
}