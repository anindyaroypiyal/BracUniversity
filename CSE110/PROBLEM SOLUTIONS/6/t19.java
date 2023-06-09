import java.util.Scanner;
public class t19{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int prod = 1 ;
    
    for (int i = 1; i <= x ; i++){
    prod = prod * 10;
    }
 System.out.println(prod);
  }
}