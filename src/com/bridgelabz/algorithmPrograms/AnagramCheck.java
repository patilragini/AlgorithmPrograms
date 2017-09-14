/****************************************************************************** 
 *  Purpose: Determines entered strings are anagram or not 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two strings");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		if (Utility.anagramChecker(str1, str2)) {
			System.out.println("Strings Are Anagrams");
		} else
			System.out.println("Strings Are Not Anagrams");
		scanner.close();

	}
}