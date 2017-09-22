/****************************************************************************** 
 *  Purpose: Determines entered strings are anagram or not 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs.copy;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char again;
			do {
				System.out.println("enter two strings");
				String str1 = scanner.next();
				String str2 = scanner.next();
				if (Utility.anagramChecker(str1, str2)) {
					System.out.println("Strings Are Anagrams");
				} else
					System.out.println("Strings Are Not Anagrams");

				System.out.println("do you want to continue?");
				again = scanner.next().charAt(0);
			} while (again == 'y' || again == 'Y');
			System.out.println("end");
		} catch (Exception e) {
			System.out.println("Type Error!!!");
		}
		scanner.close();
	}
}