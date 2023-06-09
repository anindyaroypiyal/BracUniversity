import java.util.Scanner;
public class p22 {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int row = on.nextInt();
        
        
        for (int i =1 ; i <= row ; i++){
            for (int j = 1 ; j <= i ; j++){
                
                if(i == 1 || i == row) {
                    System.out.print("*");
                }
                else if (j == 1 || j == i ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
