package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise09 {

	public static void main(String[] args) {
		//Write a Java program to calculate the first and last day of each week
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(df.format(cal.getTime()));
        for (int i = 0; i < 6; i++) {
        	cal.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(cal.getTime()));
		System.out.println();
	}

}
