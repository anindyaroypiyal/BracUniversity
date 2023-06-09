import java.util.Scanner;
public class SnakeLudo{
  public static void main(String[] args){
  
  Scanner on = new Scanner(System.in);
  
  int arr[] = new int [200];
  int SnakeTile = 0;
  int length = 0;
  int dice = 0;
  int dice2 = 0;
  int Player1position = 0;
  int Player2position = 0;
  int r = 0;

  for(int snake = 1 ; snake <= 15 ; ){
    SnakeTile = (int)(Math.random() * 199);
    length = (int)(Math.random() * 10) + 1;
  
    if (SnakeTile - length >= 0) {
      if (arr[SnakeTile - length] == 0) {
       arr[SnakeTile] = length;
        snake++;

      }
    }
  }
  System.out.println("Game Started");
  System.out.println("Name of Player 1");
  String n1 = on.nextLine();
  System.out.println("Name of Player 2");
  String n2 = on.nextLine();
  
  Player1position = 1; 
  Player2position = 1;
  for (int k = 0 ; k < 1000 ; ){
    while (Player1position <= 100)
    {
      
     System.out.println("turn of "+n1);
     System.out.println("Press 1 to roll dice");
     r = on.nextInt();
     dice=0;
     if (r == 1){
       dice = (int)(Math.random() * 6) + 1;
       System.out.println("You got "+dice +" on dice");
     }
     if (dice == 6) {System.out.println(n1 +" got another turn");
     System.out.println("Press 1 to roll dice");
     r = on.nextInt();
     dice = 0;
     if (r == 1){
       dice = 6 + (int)(Math.random() * 6) + 1;
       System.out.println("Total is "+dice);
     }
     }
     Player1position = Player1position + dice;
     if (arr[Player1position] > 0 ) {
     System.out.println(n1 +" got bitten by snake");
     Player1position = Player1position - arr[Player1position];
     }
     System.out.println(n1 +" is in tile "+Player1position);
     System.out.println();
     if (Player1position >= 100) {System.out.println(n1 +" is the winner");
     System.out.println("Game Over");}
     
     break;}
    
    if (Player1position >= 100) {break;}
    
      while (Player2position <= 100){
   
    
     System.out.println("turn of "+n2);
      System.out.println("Press 1 to roll dice");
     r = on.nextInt();
     dice2 = 0;
     if (r == 1){
       dice2 = (int)(Math.random() * 6) + 1;
       System.out.println("You got "+dice2 +" on dice");
     }
      if (dice2 == 6) {System.out.println(n2 +" got another turn");
     System.out.println("Press 1 to roll dice");
     r = on.nextInt();
     dice2 = 0;
     if (r == 1){
       dice2 = 6 + (int)(Math.random() * 6) + 1;
       System.out.println("Total is "+dice2);
     }
     }
     Player2position = Player2position + dice2;
     if (arr[Player2position] > 0 ) {
     System.out.println(n2 +" got bitten by snake");
     Player2position = Player2position - arr[Player2position];
     }
     System.out.println(n2 +" is in tile "+Player2position);
     System.out.println();
     if (Player2position >= 100) {System.out.println(n2 +" is the winner");
     System.out.println("Game Over");}
     
     break;}
      
      if (Player2position >= 100) {break;}
  
  } 

  }
}