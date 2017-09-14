/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   9-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeRange {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("enter lower number");
			int minRange = scanner.nextInt();
			System.out.println("enter higher number");
			int maxRange = scanner.nextInt();
			for (int i = minRange; i <= maxRange; i++) {
				if (Utility.checkPrime(i)) {
					System.out.println(i);
				}
			} // End of for loop
		} catch (Exception e) {
			System.out.println("Input TYpe Error!!!");
		}
		scanner.close();
	}
}
