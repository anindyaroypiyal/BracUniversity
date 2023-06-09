import java.util.Scanner;
public class p19 {
   public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int row = on.nextInt();
        
        
        for (int i =1 ; i <= row ; i++){
            for (int space = 1 ; space <= row - i ; space++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2*i) - 1 ; j++){
                System.out.print("*");
            }
           System.out.println(); 
        }
            
    }
}
