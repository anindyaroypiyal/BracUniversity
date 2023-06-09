 import java.util.Scanner;
public class task13{
  public static void main(String[]args){
   Scanner on = new Scanner(System.in);
    System.out.println("enter input");
    int input = on.nextInt();
   
    
    for (int linecount=1;linecount<=input;linecount++) {
      for (int spacecount=input-1;spacecount>=linecount;spacecount--) {
       System.out.print(" ");
      } for (int starcount =1 ; starcount <= ((2*linecount)-1);starcount++) {
        System.out.print(starcount);
      }System.out.println();
    }
    
    for(int linecount=input-1;linecount>=1;linecount--)
       { for (int spacecount=1;spacecount<=(input-linecount);spacecount++) {
        System.out.print(" ");
       } for (int starcount=1; starcount <= ((2*linecount)-1);starcount++) {
        System.out.print(starcount);
      }System.out.println();
      
    }
       }
     }