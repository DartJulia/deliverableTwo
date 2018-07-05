package unit1Lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Lab1_Part2 {

	public static void main(String[] args) throws ParseException {

		// read in input from user in specified format
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program will calculate duration between two dates in years, months, and days.");
		System.out.println("Please enter two dates in the format mm/dd/yyyy");
		Date userDate1 = format.parse(scanner.nextLine());
		Date userDate2 = format.parse(scanner.nextLine());
		scanner.close();

		// Calculates difference in milliseconds and then convert to days, months,
		// years.
		long diff = userDate1.getTime() - userDate2.getTime();
		long diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		diffDays = Math.abs(diffDays);
		long diffYears = diffDays / 365;
		long diffMonths = diffDays / 30;

		// Prints output
		System.out.println(
				"The difference is: " + diffDays + " days, " + diffMonths + " months, and " + diffYears + " years.");



	}

}
