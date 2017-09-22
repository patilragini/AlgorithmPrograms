/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion .java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion n n
 
 *  Purpose: accept celcius and fahrenhite from user and convert 
			 celcius to fahrenhite and vice versa
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs.copy;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char again;
			do {
				System.out.println("enter celsius and fahrenhite");
				int tempCel = scanner.nextInt();
				int tempFar = scanner.nextInt();
				System.out.println();
				System.out.println("The Entered value of Celsius is :" + tempCel + "   and Fahrenhite is :" + tempFar);
				System.out.println();
				System.out.println("MENU:"); // display menu tu user
				System.out.println("1. Celcius to Fahrenhite");
				System.out.println("2. Fahrenhite to Celcius");
				System.out.println();
				System.out.println("Enter your choice 1 or 2 :");
				/*
				 * accept choice form user using nextInt() and store int value
				 * in reslut variable
				 */
				int choice = scanner.nextInt();
				System.out.println("The entered choice is= " + choice);
				Utility.temperatureConversion(tempCel, tempFar, choice);
				System.out.println("do you want to continue y/n ?" + "");
				again = scanner.next().charAt(0);
			} while (again == 'y' || again == 'Y');
			System.out.println("end");
		} catch (Exception e) {
			System.out.println("Type Error!!!");
		}
		scanner.close();
	}
}