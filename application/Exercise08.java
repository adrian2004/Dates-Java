package application;

import java.util.Calendar;

public class Exercise08 {

	public static void main(String[] args) {
		//Write a Java program to get the last date of the month
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH) + "/"
												+ (cal.get(Calendar.MONTH) + 1) +"/"
												+ cal.get(Calendar.YEAR));
	}

}
