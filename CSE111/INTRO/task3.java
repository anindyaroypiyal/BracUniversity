/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg3.lab;

/**
 *
 * @author 19101577
 */
import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner on = new Scanner(System.in);
        
        String s = on.nextLine();
        
        int len = s.length();
        
        for(int i = 0 ; i < len ; i++){
            char ch = s.charAt(i);
            System.out.println(ch +":"+(int)ch);
        
        }
        
    }
}
