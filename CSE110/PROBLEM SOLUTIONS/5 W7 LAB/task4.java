import java.util.Scanner;
public class task4{
  public static void main (String[]args){
  
    Scanner on = new Scanner (System.in);
    System.out.println("Enter the value of Row:");
    int row = on.nextInt();
    System.out.println("Enter the value of Column:");
    int col = on.nextInt();
    
    for( int i=1 ; i <= row ; i++ ){
      
      for( int j=1 ; j <= col ; j++ ){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}