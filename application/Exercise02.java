package application;

import java.util.Calendar;

public class Exercise02 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		System.out.println("Day of month: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week: " + cal.get(Calendar.DAY_OF_WEEK));
		
	}
}
