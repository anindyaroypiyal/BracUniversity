import java.util.Scanner;
public class p4 {
    
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int row = on.nextInt();
        
        
        for (int i =1 ; i <= row ; i++){
            for (int space = 1 ; space <= row - i ; space++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
           System.out.println(); 
        }
            
    }
}
