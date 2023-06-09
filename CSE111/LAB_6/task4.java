/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


public class task4{
  public static char [] trim(char [] input){
	//Your code here
        int in=0;
        char[]arr2=new char[input.length];
        for(int i=0;i<input.length;i++){
        if(input[i]!=' ') {
        arr2[in]=input[i];
        in++;
        
        }
        else{
        arr2[in]=input[i];
        i++;
        while(input[i]==' '){i++;}
       
        }
        i--;
        }
        
       return arr2; 
        
        
  }
  public static void main(String [] args){
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    for (int i = 0; i< input.length; i++){
      System.out.print(input[i]);
    }
    System.out.println("");
    char []  output = trim(input);
    for (int i = 0; i< output.length; i++){
      System.out.print(output[i]);
    }
    System.out.println("");    
  }
}

