import java.io.*;
import java.util.Scanner;

public class inputTask1 {

	public static void main(String[] args) {
		try {//bufferReader
			File fl = new File("C:\\Users\\royan\\OneDrive\\Desktop\\input.txt");
			FileReader fr = new FileReader(fl);
			BufferedReader br = new BufferedReader(fr);
			String st = br.readLine();
			while(st != null) {
				System.out.println(st);
				st = br.readLine();
			}
			
			
		}
		catch(Exception e) {
			
		}
		try {//Scanner
			File fl = new File("C:\\Users\\royan\\eclipse-workspace\\summer 2020\\df.txt");
			Scanner on = new Scanner(fl);
			System.out.println();
			String st = on.nextLine();
		
			while(st != null) {
				System.out.println(st);
				st = on.nextLine();
			}
		}
		catch(Exception e) {
			
		}
	}
}
