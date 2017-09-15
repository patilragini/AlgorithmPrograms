/******************************************************************************
 *  Compilation:  javac -d bin Payment.java
 *  Execution:    java -cp bin com.bridgelabz.util.Payment n n n
 *  
 *  Purpose: Determines monthlly payment take principle,year and rate entered by user 
			 and gives payment to be made monthlly
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Payment {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		try {
			char again;
			do {
				System.out.println("enter principle amount,year,rate to calculate monthly intrest:");
				/*
				 * principle,year and rate is given by user is accepted as
				 * args[0],args[1],args[2] as string ,they are converted to
				 * double Double.parseDouble(args[]);
				 */
				double principle = scanner.nextDouble();
				double year = scanner.nextDouble();
				double rate = scanner.nextDouble();
				Utility.monthlyPayment(principle, year, rate);
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