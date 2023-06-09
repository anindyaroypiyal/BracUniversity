import java.util.Scanner;
public class pr7 {

	public static void main(String[] args) {
	Scanner on= new Scanner(System.in);
	
	String st = on.next();
	String ar = "";
	
	char []gh = st.toCharArray();
	char []cha = new char [gh.length];
	
	
	for(int i = 0 ; i < st.length() ; i++) {		
		int count = 0;
	for(int j = 0 ; j < cha.length ; j++) {
	  if(cha[j] == gh[i] ) {
		  count++;
	  } 
	}
	if (i == 0 ) {
		cha[i] = gh[i];
		ar = ar + cha[i];
	}
	else if(cha[i-1] != cha[i]) {
		cha[i] = gh[i];
		ar = ar + cha[i];
	}
	}
	
	System.out.print(ar);
	}
	}

