
public class CricketTeam extends Team{

	CricketTeam(String t, String m){
		super(t,m);
	}
	public void getMascot() {
		System.out.println("Our Cricket team mascot name is "+mascot);
	}
	public String toString() {
		return "Our name is "+name +"\nWe play cricket";
	}
}
