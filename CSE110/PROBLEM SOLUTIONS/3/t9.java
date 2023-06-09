import java.util.Scanner;
public class t9 {
  public static void main(String[] args){
  Scanner on = new Scanner(System.in);
  
  int a = on.nextInt();
  
  int max = a;
  
  int b= on.nextInt();
  
  int c= on.nextInt();
  
  if (b>a) {max = b;
   if (c>a) {max = c;
     if (c>b){max = c;}
   }
  }
  
  System.out.println("Max is :"+max);
  }
}