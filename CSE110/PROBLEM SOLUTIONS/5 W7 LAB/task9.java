import java.util.Scanner;
  public class task9 {
    public static void main(String[] args) {
    Scanner on = new Scanner(System.in);
      System.out.println("enter input");
    int input = on.nextInt();
    for (int linecount = 1;linecount<=input;linecount++) {
      for (int spacecount=input-1;spacecount>=linecount;spacecount--) {
      System.out.print(" ");
      } for (int j=1;j<=((2*linecount)-1);j++) {
      System.out.print("*");
      } System.out.println(" ");
    }
    }
}