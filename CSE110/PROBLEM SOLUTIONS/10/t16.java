import java.util.Scanner;
public class t16{
  public static void main(String[] args){
  
    Scanner on = new Scanner(System.in);
    int temp;
    int arr[] = new int[5];
    for (int i = 0; i < arr.length; i++)
    {
     arr[i] = on.nextInt();
    }
    boolean ui = false ;
    while (ui == false) {
      ui = true;
    for (int a = 0; a < arr.length-1; a++ ){
      if (arr[a] > arr[a+1]) {
       temp = arr[a+1];
       arr[a+1] = arr[a];
       arr[a] = temp;
        
        ui = false;
      }
    }
    }
    for (int d = arr.length-1; d>=0; d--){
      System.out.print(arr[d] + ",");
    }
  }
}