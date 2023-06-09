import java.util.Scanner;
public class task17 {
  public static void main(String[] args) {
  System.out.print("enter input");
  Scanner on= new Scanner(System.in);
  int input = on.nextInt();
  for (int linecount =1;linecount <= input ; linecount++) 
  { for (int starcount =1; starcount <= linecount ; starcount++) 
    { if (linecount ==1 || linecount == input) {System.out.print(starcount);}
    else{ if (starcount==1 || starcount == linecount) {System.out.print(starcount);}
        else {System.out.print(" ");}
        }
    }System.out.println(); 
   }
  
  }
}