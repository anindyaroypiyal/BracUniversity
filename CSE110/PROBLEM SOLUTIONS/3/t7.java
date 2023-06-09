import java.util.Scanner;
public class t7 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  
  int x = on.nextInt();
  
  int y = on.nextInt();
  
  int z = on.nextInt();
  
  int s =(x+y+z)/2;
  
  double area = Math.pow(((s-x)*(s-y)*(s-z)),(1/s));
  
  System.out.println(area);
  }
}