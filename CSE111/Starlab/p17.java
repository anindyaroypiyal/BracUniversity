import java.util.Scanner;
public class p17 {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int row = on.nextInt();
        
        
        for (int i =1 ; i <= row ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
}

