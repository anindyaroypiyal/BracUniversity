import java.util.Scanner;
public class t3 {
  public static void main(String[] args){
    
  Scanner on = new Scanner(System.in);
  System.out.println("enter height");
  int h = on.nextInt();
  
    System.out.println("enter width");
    int w = on.nextInt();
    
    int area = h*w;
    
    System.out.println("Area is = "+area);
  
  }
}