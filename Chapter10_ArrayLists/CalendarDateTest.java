package Chapter10;

// Short program that creates a list of the birthdays of the
// first 5 U.S. Presidents and that puts them into sorted order.

import java.util.*; 

public class CalendarDateTest {
	public static void main(String[] args) {
		ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
		dates.add(new CalendarDate(2, 22));   // Washington
		dates.add(new CalendarDate(10, 30));  // Adams
		dates.add(new CalendarDate(4, 13));   // Jefferson
		dates.add(new CalendarDate(3, 16));   // Madison
		dates.add(new CalendarDate(4, 28));   // Monroe
		System.out.println("birthdays = " + dates);
		System.out.println((dates.get(0)).compareTo(dates.get(1)));
		// Collections.sort(dates);											// bug here
		System.out.println("birthdays = " + dates);
	}
}
