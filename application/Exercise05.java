package application;

import java.util.Calendar;
import java.util.TimeZone;

public class Exercise05 {

	public static void main(String[] args) {
		//Write a Java program to get the current time in New York
		Calendar calNY = Calendar.getInstance();
		
		calNY.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Time in NY: " 
							+ calNY.get(Calendar.HOUR_OF_DAY) 
							+ ":" 
							+ calNY.get(Calendar.MINUTE) 
							+ ":" 
							+ calNY.get(Calendar.SECOND));
	}
}