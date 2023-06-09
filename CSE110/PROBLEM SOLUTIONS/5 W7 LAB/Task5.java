import java.util.Scanner;
public class Task5{
  public static void main (String[]args){
    
    Scanner input = new Scanner (System.in);
   
    System.out.println("Enter the value of Row:");
    int row = input.nextInt();
     
    for( int linecount=1 ; linecount <= row ; linecount++ ){
      
      for( int num =1 ; num <= linecount ; num++){
      System.out.print("*");
      }
      System.out.println();
    }
  }
}