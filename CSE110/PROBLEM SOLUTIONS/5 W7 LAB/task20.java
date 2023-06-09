import java.util.Scanner;
public class task20 {
  public static void main(String[] args) {
  System.out.print("enter input");
  Scanner on= new Scanner(System.in);
  int input = on.nextInt();
  for (int linecount =1;linecount <= input ; linecount++) {
    
    for (int space = 1 ; space <= (input - linecount) ; space++) {
      System.out.print(" ");
    }
      
   for (int starcount =1; starcount <= ((2*linecount)-1) ; starcount++) 
    { if (linecount ==1 || linecount == input) {System.out.print("*");}
    else{ if (starcount==1 || starcount == ((2*linecount)-1)) {System.out.print("*");}
        else {System.out.print(" ");}
        }
    }System.out.println(); 
   }
  
  }
}