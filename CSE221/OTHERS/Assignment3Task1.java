public class Assignment3Task1 {

	public static void main(String[] args) {
		
		String school = "C D E F G A B C";
		String student = "C E F D A B G A C";
		
		String []arry1 = school.split(" ");
		String []arry2 = student.split(" ");
		
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
			
		for(int k = s.length -1 ; k >= 0; k--) {
			if(seq[k] != null) {
			System.out.print(seq[k]);
			}
		}	
			double w = arry1.length;
			double ac = (s[a1][a2] / (w) * 100);
			
			System.out.println("\n"+(int)ac+"% PASSED");
			
	}
}
