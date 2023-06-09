/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;

import java.util.Scanner;
public class task5 {
public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    
    int []arr = new int [10];
    for(int i = 0; i<arr.length; i++){
        arr[i] = on.nextInt();
    }
    System.out.println();
    int x = on.nextInt();
    int counter = 0;
     for(int i = 0 ; i < arr.length;i++){
         if (x == arr[i]){
             counter++;
         }
     
     }
     if (counter != 0) {
         System.out.println("yes");
         
     }
     else {
         System.out.println("no");
     }
}
}