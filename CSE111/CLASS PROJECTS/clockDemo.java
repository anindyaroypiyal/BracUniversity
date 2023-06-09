
public class clockDemo {

	public static void main(String[] args) {
		
		Clock firstClock = new Clock(15236);
		
		for (int i= 1; i < 11; i++) {
			System.out.println(firstClock.tick());
		}
		Clock secondClock = new Clock(13,52,32);
		for (int i = 1 ; i < 11 ; i++) {
			System.out.println(secondClock.tick());
		}

		firstClock.addClock(secondClock);
		System.out.println(firstClock.toString());
		System.out.println(secondClock.toString());
		
		String thirdClock = firstClock.subtractClock(secondClock);
	}
	
	

}
