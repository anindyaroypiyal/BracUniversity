import java.util.*;
public class Assignment3Task2 {

	public static void main(String[] args) {
		
		Hashtable <String , String> word = new Hashtable <String , String>();
		
		word.put("M", "monkeys");
		word.put("W","wearing");
		word.put("C","coats");
		word.put("A","are");
		word.put("D","doctors");
		word.put("B","because");
		word.put("O","of");
		word.put("E","evolution");
		word.put("R","results");
		word.put("P","eruption");
		
		
		String ross = "M W C A D B O E";
		String chandler = "D M W C A R O P";
		
		String []arry1 = ross.split(" ");
		String []arry2 = chandler.split(" ");
		
		int a1 = arry1.length;
		int a2 = arry2.length;
		
		int [][] s = new int[a1+1][a2+1];
		String []seq = new String[a2];
		int a = 0;
// table builder		
		for(int i = 0; i <= a1 ; i++) {
			for(int j = 0 ; j <= a2 ; j++) {
				if(i == 0 || j == 0) {
					s[i][j] = 0;
				}
				else if(arry1[i-1].equals(arry2[j-1])) {
					s[i][j] = s[i-1][j-1] + 1;

				}
				else {
					s[i][j] = Math.max(s[i-1][j], s[i][j-1]);
				}
			}
		}	
// Backtrack code
		int i = a1;
		int j = a2;
		while(i != 0 || j != 0) {
				if(s[i][j] == s[i][j-1]) {
					j = j -1;
					
				}
				else if(s[i][j] == s[i-1][j]) {
					i = i - 1;
					
				}
				else {
					seq[a] = arry2[j-1];
					a++;
					i = i-1;
					j = j-1;
				}
			}
			
		System.out.println(s[a1][a2]);
		for(int k = arry1.length - 1 ; k >= 0; k--) {
			if(seq[k] != null) {
			String x = word.get(seq[k]);
			
			System.out.print(x+" ");

			}
		}		
	}
}
