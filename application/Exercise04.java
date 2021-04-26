package application;

import java.util.Calendar;

public class Exercise04 {

	public static void main(String[] args) {
		//Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar.
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Time: " + cal.getTime());
		
		System.out.println();
		System.out.println("Minimum Day of Week: " + cal.getActualMinimum(Calendar.DAY_OF_WEEK));
		System.out.println("Minimum Day of Month: " + cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println("Minimum Month: " + cal.getActualMinimum(Calendar.MONTH));
		System.out.println("Minimum Year: " + cal.getActualMinimum(Calendar.YEAR));
	}

}
