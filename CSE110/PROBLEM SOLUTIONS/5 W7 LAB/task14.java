import java.util.Scanner;
public class task14 {
  public static void main(String[]args){
   Scanner on = new Scanner(System.in);
   System.out.println("enter row"); 
   int row = on.nextInt();
   System.out.println("enter column");
   int column = on.nextInt();
   for (int linecount=1;linecount <= row;linecount++)
   { for (int starcount=1;starcount<=column;starcount++) 
     { if (linecount == 1 || linecount == row) {
          System.out.print("*");
         }
      else { if (starcount==1 || starcount == column) {System.out.print("*");}
             else {System.out.print(" ");}
           }
   
     }
    System.out.println();
  }
 }
} 