import java.util.Scanner;
public class task25{
  public static void main (String[] args) {
  
  System.out.println("enter input");  
  Scanner on = new Scanner(System.in);
  int input = on.nextInt();
  int num;
  
  for (int linecount=1 ; linecount <= input ; linecount++) {
    
    for (int spacecount = 1; spacecount <= (input - linecount); spacecount++ ) {
      
      System.out.print(" "); }
    
  for ( num  = 1; num <= linecount; num++)
  { System.out.print(num);
    } 
   
  for (int i = num - 2 ; i >= 1; i--) {
    System.out.print(i);}
  System.out.println();
  }
  }
  } 
  
