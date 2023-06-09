import java.util.Scanner;
public class Task8{
  public static void main (String[]args){
    
    Scanner input = new Scanner (System.in);
   
    System.out.println("Enter the value of Row:");
    int row = input.nextInt();
     
    for( int linecount=1 ; linecount <= row ; linecount++ ){
      
      for (int spacecount = 1; spacecount <= (row - linecount) ; spacecount++) {
      System.out.print(" ");
      }
      
      for( int num =1 ; num <= linecount ; num++){
      System.out.print(num);
      }
      System.out.println();
    }
  }
}