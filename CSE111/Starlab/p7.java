import java.util.Scanner;
public class p7 {
    public static void main(String[] args) { 
    Scanner on = new Scanner(System.in);
 
    int row = on.nextInt();
    int col = on.nextInt();
    
    for(int i =1; i <= row ; i++){
        for (int j = 1; j<= col ; j++ ){
            if (i==1 || i == row ) {
                System.out.print(j);
            }
            else if(j == 1 || j == col){
                System.out.print(j);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
  }
}
