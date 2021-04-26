package application;

import java.util.Calendar;

public class Exercise01 {

	public static void main(String[] args) {
		// Write a Java program to create a Date object using the Calendar class.
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DAY_OF_MONTH, 12);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.YEAR, 2004);
		
		cal.set(Calendar.HOUR, 13);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 15);
		
		System.out.println(cal.getTime());
	}

}
