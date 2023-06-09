
public class FootBallTeam extends Team{

	FootBallTeam(String t, String m){
		super(t,m);
	}
	public void getMascot() {
		System.out.println("Our Football team mascot name is "+mascot);
	}
	public String toString() {
		return "Our name is "+name +"\nWe play football";
	}
}
