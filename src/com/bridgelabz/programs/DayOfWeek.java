
/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek n n n 
 
 *  Purpose: Determines day of enterd date month year by user
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
	static int month, date, year;

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		try {
		char again;
		do {
			System.out.println("enter date month year");
			date = scanner.nextInt();
			month = scanner.nextInt();
			year = scanner.nextInt();
			if (date < 0 && date < 32 && month < 11 && month < 0) {
				Utility.dayOfWeek(date, month, year);
			}
			System.out.println("do you want to continue y/n ?" + "");
			again = scanner.next().charAt(0);
		} while (again == 'y' || again == 'Y');
		System.out.println("end");
		} catch (Exception e) {
			System.out.println("Type Error!!!");
		scanner.close();
	}
}
}