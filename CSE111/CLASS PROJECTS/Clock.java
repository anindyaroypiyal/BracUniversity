
public class Clock {

	private int hours;
	private int minutes;
	private int seconds;
	
	public Clock(){
		hours = 12;
		minutes = 0 ;
		seconds = 0;
	}
	Clock(int h , int m , int s){
		hours = h;
		minutes = m;
		seconds = s;
	}
	Clock(int seconds){
		hours = seconds / 3600;
		seconds = seconds % 3600;
		minutes = seconds / 60;
		seconds = seconds % 60;
	}
	public void setClock() {
		hours = seconds / 3600;
		seconds = seconds % 3600;
		minutes = seconds / 60;
		seconds = seconds % 60;
	}
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	
	public void setHours(int h) {
		hours = h;
	}
	public void setMinutes(int m) {
		minutes = m;
	}
	public void setSeconds(int s) {
		seconds = s;
	}
	public String tick() {
		int sec1 = hours * 3600 + minutes * 60 + seconds;
		++sec1;
		hours = sec1 / 3600;
		sec1 = sec1 % 3600;
		minutes = sec1 / 60;
		seconds = sec1 % 60;
		
		String s1 = hours +":" +minutes +":" +seconds;
		return s1;
	}
	
	public String addClock(Clock firstClock) {
		int sec2 = hours * 3600 + minutes * 60 + seconds;
		int sec3 = firstClock.hours * 3600 + firstClock.minutes * 60 + firstClock.seconds;
		
		int sec4 = sec2 + sec3;
		
		hours = sec4 / 3600;
		sec4 = sec4 % 3600;
		minutes = sec4 / 60;
		seconds = sec4 % 60;
		
		String s4 = hours +":" +minutes +":" +seconds;
		return s4;
	}
	public String toString() {
		String s2 = hours +":"+minutes+ ":"+seconds;
		return s2;
	}
	public String tickDown() {
		int sec5 = hours * 3600 + minutes * 60 + seconds;
		--sec5;
		hours = sec5 / 3600;
		sec5 = sec5 % 3600;
		minutes = sec5 / 60;
		seconds = sec5 % 60;
		
		String s5 = hours +":" +minutes +":" +seconds;
		return s5;
	}
	public String subtractClock(Clock firstClock) {
		int sec6 = hours * 3600 + minutes * 60 + seconds;
		int sec7 = firstClock.hours * 3600 + firstClock.minutes * 60 + firstClock.seconds;
		
		int sec8 = sec6 + sec7;
		
		hours = sec8 / 3600;
		sec8 = sec8 % 3600;
		minutes = sec8 / 60;
		seconds = sec8 % 60;
		
		String s8 = hours +":" +minutes +":" +seconds;
		return s8;
	}
}
