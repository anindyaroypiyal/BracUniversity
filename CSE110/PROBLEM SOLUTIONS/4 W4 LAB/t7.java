import java.util.Scanner;
public class t7 {
  public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    System.out.println("Enter quantity");
    int q = on.nextInt();
    for (int i =1 ; i <= q ; i++) {
    System.out.println("Enter number");
      int num = on.nextInt();
      if (num % 2 == 0) {System.out.println("even");}
      else {System.out.println("odd");}
    }
  }
}