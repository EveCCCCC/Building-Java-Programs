package Chapter8;

public class TimeSpanMain {
	public static void main(String[] args) {
		TimeSpan ts1 = new TimeSpan(1, 32);
		System.out.println(ts1);
		TimeSpan ts2 = new TimeSpan(0, 379);
		System.out.println(ts2 + "\n");
		
		TimeSpan ts3 = ts1.interval(ts2);
		System.out.println(ts3);
	}
}
