/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg2;

import java.util.Scanner;
public class task4 {
public static void main(String[] args){
    Scanner on = new Scanner(System.in);
    
    int []arr = new int [20];
    for(int i = 0; i<arr.length; i++){
        arr[i] = on.nextInt();
    }
    System.out.println();
    for(int i = arr.length-1 ; i>=0 ; i--){
        if (arr[i] % 2 == 0){
        System.out.println(arr[i]);
    }
    }    
}
}
