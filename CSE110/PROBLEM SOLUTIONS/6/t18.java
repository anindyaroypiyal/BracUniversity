import java.util.Scanner;
public class t18{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    System.out.println("enter number");
    int x = on.nextInt();
    int count = 0;
    
    
    for (int i = x; i>=0 ; i--)
    {
    x = x / 10;
    if (x >= 0){count++; 
               i = x;
               }    
    } 
    System.out.println(count +" digits");
  }
}
