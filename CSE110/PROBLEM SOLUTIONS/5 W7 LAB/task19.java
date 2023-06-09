import java.util.Scanner;
public class task19 {
  public static void main(String[] args) {
  System.out.print("enter input");
  Scanner on= new Scanner(System.in);
  int input = on.nextInt();
  for (int linecount =0;linecount <= (input-1) ; linecount++) 
  { for (int starcount = input; starcount >= (input-linecount) ; starcount--) 
    { if (linecount == 0 || linecount == (input-1)) {System.out.print(starcount);}
    else{ if (starcount==input || starcount == (input-linecount)) {System.out.print(starcount);}
        else {System.out.print(" ");}
        }
    }System.out.println(); 
   }  
  }
}