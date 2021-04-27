package application;

import java.util.Calendar;

public class Exercise07 {

	public static void main(String[] args) {
		//Write a Java program to get the last day of the current month
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
