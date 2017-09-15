/******************************************************************************
 *  Compilation:  javac -d bin Sqrt .java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt 
 *  
 *  Purpose: Computes the square root of a nonnegative number c using
 *  	  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {
	static double number;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char again;
			do {
				System.out.println("enter number to find root ");
				int number = scanner.nextInt();
				System.out.println("square root of " + number + " is");
				Utility.sqrt(number);
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