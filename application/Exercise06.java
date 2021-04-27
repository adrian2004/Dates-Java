package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise06 {

	public static void main(String[] args) {
		//Write a Java program to get current full date and time
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf.format(date.getTime()));
	}

}
