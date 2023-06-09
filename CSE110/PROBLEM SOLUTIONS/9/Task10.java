import java.util.Scanner;
public class Task10{
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("How many numbers do you want to take");
    int num = input.nextInt();
    int a [] = new int[num];
    String roy = "";
    int vari = 0;
    int coun = 0;
    for(int i = 0 ; i < a.length ; ){
      int x = input.nextInt();
      if(x>=0 && x<=9){
        a[i] = x ;
        i++;
      }
      else{
        System.out.println("Enter another number");
      }
    }
    for(int i = 0 ; i < a.length ; i++){
        int count = 0;
      for(int j = 0 ; j < a.length ; j++){
        if(a[i] == a[j]){
          count++;
        }
       
        if(coun<2){
        if(vari != a[i] || a[i]==0){
        if(count==2 && count<5){
          vari = a[i];
          roy=roy+a[i]+" ";
          coun++;
        }
        }
      }
      }
      }
    System.out.println("Output is "+" "+roy);
  }
}
          


      