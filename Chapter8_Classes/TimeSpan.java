package Chapter8;

// represents a time span of elapsed hours and minutes
// Class invariant: hours >= 0 && minutes >= 0 && minutes < 60

public class TimeSpan {
	//private int hours;        // method1: we have both minutes and hours as internal fields
	//private int minutes;
	private int totalMinutes;   // method2: we may use only totalMinutes as field, actually easier
	
	// constructor
	// pre: hours>= 0 && minutes >=0
	public TimeSpan(int hours, int minutes) {
		//this.hours = 0;
		//this.minutes = 0;
		this.totalMinutes = 0;
		add(0, hours*60 + minutes);
	}
	
	// Add given interval to this time span
	// pre: hours>= 0 && minutes >=0
	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0) {
			throw new IllegalArgumentException();
		}
		//this.hours += hours;
		//this.minutes += minutes;
		// convert each 60 minutes into one hour
		//this.hours += this.minutes / 60;
		//this.minutes = this.minutes % 60;
		this.totalMinutes += hours*60 + minutes;
	}
	
	public int getHours() {
		//return this.hours;
		return this.totalMinutes/60;
	}
	
	public int getMinutes() {
		//return this.minutes;
		return this.totalMinutes%60;
	}
	
	// returns the interval between 2 time spans as a new TimeSpan
	public TimeSpan interval(TimeSpan ts) {
		//int minutes1 = this.hours * 60 + this.minutes;
		//int minutes2 = ts.hours * 60 + ts.minutes;
		return new TimeSpan(0, Math.abs(totalMinutes - ts.totalMinutes));
	}
	
	// returns a String for this object, such as "2h 35m"
	public String toString() {
		return totalMinutes/60 + "h" + " " + totalMinutes%60 + "m";
	}
}
