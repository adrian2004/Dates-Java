package application;

import java.util.Calendar;

public class Exercise03 {

	public static void main(String[] args) {
		//Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar.
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Time: " + cal.getTime());
		
		System.out.println();
		System.out.println("Maximum Day of Week: " + cal.getActualMaximum(Calendar.DAY_OF_WEEK));
		System.out.println("Maximum Day of Month: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Maximum Month: " + cal.getActualMaximum(Calendar.MONTH));
		System.out.println("Maximum Year: " + cal.getActualMaximum(Calendar.YEAR));
	}

}
