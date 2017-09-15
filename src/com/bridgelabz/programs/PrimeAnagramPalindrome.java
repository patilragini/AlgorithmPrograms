package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listanagram = new ArrayList<Integer>();
		List<Integer> listpalindrome = new ArrayList<Integer>();
		int a = 0;
		for (int i = a; i < 1000; i++) {
			if (Utility.checkPrime(i)) {
				list.add(i);
			}
		}
		System.out.println("prime numbers are:" + list);
		System.out.println("Total number of prime numbers are:" + list.size());

		for (int j = 0; j < list.size() - 1; j++) {
			for (int k = j + 1; k < list.size() - 1; k++) {
				if (Utility.anagramChecker2(list.get(j), list.get(k))) {
					listanagram.add(list.get(j));
				}
			}
		}

		System.out.println("\nAnagram numbers are :" + listanagram);
		System.out.println("Total number of anagram numbers are :" + listanagram.size());

		for (int j = 0; j < listanagram.size() - 1; j++) {
			if (Utility.palindromeChecker(listanagram.get(j))) {
				listpalindrome.add(listanagram.get(j));
			}
		}

		System.out.println("\nPalindrom numbers are :" + listpalindrome);
		System.out.println("Total number of palindrome numbers are :" + listpalindrome.size());

	}
}
