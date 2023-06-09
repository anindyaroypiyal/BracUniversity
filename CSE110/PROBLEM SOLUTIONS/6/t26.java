import java.util.Scanner;
public class t26{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int count = 0;
 
    for (int i = 2; i < x ; i++){
      if (x % i == 0) {count++;}
      
    }
    if (count == 0) {System.out.println("Prime number");}
      else {System.out.println("Not a prime number");}
  }
}