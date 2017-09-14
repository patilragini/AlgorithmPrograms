package com.bridgelabz.utility;

import java.util.Arrays;

public class Utility123 {

	/**
	 * 
	 * @param str1
	 *            E
	 * @return String
	 *         <p>
	 *         removes all spaces passed in args and returns string withno space
	 * 
	 */
	private static <E> String replace(E str1) {
		// TODO Auto-generated method stub
		String nospace = ((String) str1).replaceAll("\\s", "");
		// System.out.println(nospace);
		return nospace;
	}

	/**
	 * @param str1
	 *            E
	 * @param str2
	 *            E
	 * @return boolean
	 *         <p>
	 *         true ->is anagram
	 *         <p>
	 *         false ->not anagram
	 */
	public static <E> Boolean anagramChecker(E str1, E str2) {
		String s1 = replace(str1);
		String s2 = replace(str2);
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			// System.out.println(s1 + " and " + s2 + " are anagrams");
			return true;
		} else {
			// System.out.println(s1 + " and " + s2 + " are not anagrams");
			return false;
		}
	}

	// function to check prime no
	/**
	 * @author ragini
	 * @param int
	 *            n
	 * @return int number
	 **/
	public static boolean checkPrime(int n) {
		// condition to check if no less than two
		if (n < 2) {
			return false;
		}
		// for loop to for checkin prime no
		for (int factor = 2; factor * factor <= n; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (n % factor == 0) {
				return false;
			}
		} // End of for loop
		return true;
	}
	/**
	 * 
	 * @param element int
	 * @return boolean
	 * <p> returns true if number in parameter is palindrome
	 * else false
	 */
	public static Boolean palindromeChecker(int element) {
		int temp = (int) element;
		int sum = 0, remainder;
		while (element > 0) {
			remainder = element % 10; // gettielementg remaielementder
			sum = (sum * 10) + remainder;
			element = element / 10;
		}
		if (temp == sum) {
		//	System.out.println("palindrome number ");
			return true;
		} else {
			//System.out.println("not palindrome");
			return false;

		}
	}

}//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
