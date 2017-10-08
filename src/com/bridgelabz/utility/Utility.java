package com.bridgelabz.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Utility {

	/**
	 * 
	 * @param string1 E
	 * @return String
	 *         <p>
	 *        Generic method that removes all spaces passed in args and returns string with no space
	 * 
	 */
	private static <E> String noSpace(E string1) {
		String nospace = ((String) string1).replaceAll("\\s", "");
		return nospace;
	}

	/**
	 * @param string1  E
	 * @param string2  E
	 * @return boolean
	 *         <p>
	 *         true ->is anagram
	 *         <p>
	 *         false ->not anagram
	 *			<p>Generic method that checks two strings and returns boolean value
	 */
	public static <E> Boolean anagramChecker(E word1, E word2) {
		String string1 = noSpace(word1);
		String string2 = noSpace(word2);
		boolean status = true;
		if (string1.length() != string2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = string1.toLowerCase().toCharArray();
			char[] ArrayS2 = string2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			// System.out.println(string1 + " and " + string2 + " are
			// anagrams");
			return true;
		} else {
			// System.out.println(string1 + " and " + string2 + " are not
			// anagrams");
			return false;
		}
	}

	// function to check prime no
	/**
	 * @author ragini
	 * @param int  number
	 * @return boolean
	 *		<p>function to check prime number
	 **/
	public static boolean checkPrime(int number) {
		// condition to check if no less than two
		if (number < 2) {
			return false;
		}
		// for loop to for checkin prime no
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % factor == 0) {
				return false;
			}
		} // End of for loop
		return true;
	}

	/**
	 * 
	 * @param element
	 *            int
	 * @return boolean
	 *         <p>
	 *         returns true if number in parameter is palindrome else false
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
			// System.out.println("palindrome number ");
			return true;
		} else {
			// System.out.println("not palindrome");
			return false;

		}
	}

	/***
	 * 
	 * @param array
	 *            , element
	 * @param
	 * @return isPresent boolean
	 *		<p> binarySearchGeneric accepts array and word and search in array
	 */
	public static <T extends Comparable<T>> boolean binarySearchGeneric(T array[], T word) {

		Utility.doBubbleSortGeneric(array);
		boolean isPresent = false;
		int high = array.length - 1;
		int mid = high / 2;
		int low = 0;
		while (high >= low) {
			if (array[mid].compareTo(word) == 0) {
				isPresent = true;
				break;
			} else if (array[mid].compareTo(word) < 0) {
				low = mid + 1;
				mid = (low + high) / 2;
			} else if (array[mid].compareTo(word) > 0) {
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
	}

	/**
	 * @param unsorted
	 *            T[]
	 *            <p>do bubble sort generic
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> void doBubbleSortGeneric(T[] unsorted) {
		for (int i = 1; i < unsorted.length; i++) {
			for (int inner = 0; inner < (unsorted.length - i); inner++) {
				if ((((Comparable) (unsorted[inner])).compareTo(unsorted[inner + 1])) > 0) {
					T tmp = unsorted[inner];
					unsorted[inner] = unsorted[inner + 1];
					unsorted[inner + 1] = tmp;
				}
			}
		}

	}

	/**
	 * @author ragini
	 * @param input
	 *            T[]
	 *            <p>
	 * 			Do insertion sort generic
	 */
	public static <T extends Comparable<T>> void doInsertionSort(T[] input) {
		if (input == null) {
			throw new RuntimeException("Input array cannot be null");
		}
		int length = input.length;

		if (length == 1)
			return;
		int i, j;
		T temp;
		for (i = 1; i < length; i++) {
			// Store the current element
			temp = input[i];
			/*
			 * Compare the current element with the partially sorted group to
			 * see if its in the correct position
			 */
			for (j = i; (j > 0 && (temp.compareTo(input[j - 1]) < 0)); j--) {
				/*
				 * equalsIgnoreCase The current element is not in its correct
				 * position in the partially sorted list. Move the larger item
				 * one place to right and make space for the current element
				 */
				input[j] = input[j - 1];
			}
			/*
			 * Found the correct position for the current element in the
			 * partially sorted group. So move it to its correct place.
			 */
			input[j] = temp;
		}
	}

	/**
	 * 
	 * @param array
	 *            T[]
	 *            <p>
	 * 			prints array generic
	 */
	public static <T> void printArray(T[] array) {
		for (T elem : array) {
			System.out.print(elem);
			System.out.print(" ");
		}
		System.out.println();
	}

	/**
	 * 
	 * @param int
	 *            first,int last
	 * @return find guessed Number
	 */
	public static void guessNumber(int first, int last) {
		Scanner scanner = new Scanner(System.in);
		// binary logic
		int middle = (first + last) / 2;
		if (first < last) {
			System.out.println("Is your number between " + first + " and " + middle + " [y/n]:");
			char choice = scanner.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				guessNumber(first, middle);

			} else {
				guessNumber(middle + 1, last);
			}
		} else if (first == last) {
			System.out.println("Number is " + last);
		}
		scanner.close();
	}

	// scan file till file has words add in list and send list back
	/**
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 *             <p>
	 *             scans whole file till has next word and add to list and
	 *             returns list
	 *             <p>
	 *             i.e adds data of file to list and returns
	 */
	public static ArrayList<String> get_arraylist_from_file(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();

		while (scanner.hasNext()) {
			list.add(scanner.next());
		}
		scanner.close();
		return list;
	}

	/**
	 * @return list
	 * @throws IOException
	 *             <p>
	 *             has file as input and convert the file data to list of words
	 *             <p>
	 *             i.e get data of file and print
	 */
	public static ArrayList<String> printFile() throws IOException {
		File file = new File("/home/bridgeit/Desktop/cities.txt");
		ArrayList<String> lines = get_arraylist_from_file(file);
		for (int x = 0; x < lines.size(); x++) {
			System.out.println(lines.get(x));
		}
		return lines;
	}

	/**
	 * @param lines
	 *            array
	 * @paramword finds word from file
	 * 
	 */
	public static void findWordFromFile(ArrayList<String> lines, String word) {
		String[] array = new String[lines.size()];
		lines.toArray(array);
		if (binarySearchGeneric(array, word) == true) {
			System.out.println("String  is present");
		} else {
			System.out.println("String is not present");
		}

	}

	/**
	 * @param array
	 *            string
	 * @return string[]
	 *         <p>
	 *         perform merge sort on array and return sorted array
	 */
	public static String[] mergeSort(String[] array) {
		String firstArray[] = new String[array.length / 2];
		String secondArray[] = new String[array.length - (array.length / 2)];
		int j = 0;
		if (array.length == 1) {
			return array;
		}
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = array[i];
		}
		for (int i = firstArray.length; i < array.length; i++) {
			secondArray[j] = array[i];
			j++;
		}
		firstArray = mergeSort(firstArray);
		secondArray = mergeSort(secondArray);
		String[] returnArray = new String[array.length];
		int firstIndex = 0, secondIndex = 0;
		for (int i = 0; i < returnArray.length; i++) {
			if (secondIndex == secondArray.length) {
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			} else if (firstIndex == firstArray.length) {
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			} else if (firstArray[firstIndex].compareTo(secondArray[secondIndex]) > 0) {
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			} else {
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			}
		}

		return returnArray;// sorted array

	}

	/**
	 * @param noteCounts
	 *            int
	 * @param change
	 *            int
	 * @param position
	 *            int
	 * <p> calls recursivelly to calculate notes required for change
	 */
	public static void giveChange(int noteCounts[], int change, int position) {
		int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
		if (position < notes.length) {
			if (change < notes[position]) {
				giveChange(noteCounts, change, ++position);
			} else {
				change = change - notes[position];
				noteCounts[position]++;
				giveChange(noteCounts, change, position);
			}
		}
	}

	/**
	 * @param date
	 * @param month
	 * @param year
	 *            <p>
	 *            prints day of month
	 */
	public static void dayOfWeek(int date, int month, int year) {
		int y = (year - ((14 - month) / 12));
		int x = (y + (y / 4) - (y / 100) + (y / 400));
		int m = (month + 12 * ((14 - month) / 12) - 2);
		int d = ((date + x + (31 * m) / 12) % 7);
		// print day
		System.out.println("day is =" + d);
		// d is used as choice in switch
		switch (d) {
		case 0:
			// case 0 true print sunday
			System.out.println("Sunday");
			break; // break and go out of switch
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}

	/**
	 * @param principle
	 * @param year
	 * @param rate
	 *            <p>
	 *            prints monthly amount to be paid
	 */

	public static void monthlyPayment(double principle, double year, double rate) {
		double n, r, payment;// n,r,payment are variables to store calculations
		r = (rate / (12 * 100)); // calculate r
		n = 12 * year; // calculatre n
		payment = (principle * r) / (1 - Math.pow(1 + r, (-n))); // payment
																	// formula
		System.out.println("monthly payment=" + payment + "rs"); // print
																	// payment
																	// to be
																	// paied
	}

	static double epsilon = 1e-15, ans;
/**
 *  @param number int
 *  <p> prints square root of number
 */
	public static void sqrt(int number) {
		epsilon = 1e-15; // relative error tolerance
		ans = number; // estimate of the square root of c
		// repeatedly apply Newton update step until desired precision is
		// achieved
		if (number >= 0) {
			while (Math.abs(ans - number / ans) > epsilon * ans) {
				ans = (number / ans + ans) / 2.0;
			}
		} else
			System.out.println("invalid number");
		// print out the estimate of the square root of c
		System.out.println(ans);
	}

	/**
	 * @param tempCel
	 *            int
	 * @param tempFar
	 *            int
	 * @param choice
	 *            int
	 *            <p>
	 *            converts temperatures
	 */
	public static void temperatureConversion(int tempCel, int tempFar, int choice) {
		switch (choice) {
		// if result=1 then case 1 execute
		case 1:
			float ResultFar = (tempCel * 9 / 5) + 32; // formula of celcius to
														// fahrenhite
			System.out.println(" The " + tempCel + " in celcius is converted to " + ResultFar + " in Fahrenhite");
			break;// break come out of switch.
		case 2:
			float ResultCel = (tempFar - 32) * 5 / 9; // formula of fahrenhite
														// to celcius
			System.out.println(" The " + tempFar + " in Fahrenhite is converted to " + ResultCel + " in Celcius");
			break;// break come out of switch.
		default:
			System.out.println("invalid entry "); // if result is not in
													// case,come out of switch
													// print
		}
	}

	/**
	 * @param int
	 *            n return void convert integer number to binary calculate sum
	 *            of binary array
	 * @return binary ArrayList
	 */

	public static ArrayList<Integer> toBinary(int number) {
		int power = 1;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 16; i++) {
			array.add(0);
		}

		while (power <= number / 2) {
			power *= 2;
		}
		// check for presence of powers of 2 in number, from largest to
		// smarraylest
		while (power > 0) {
			// power is not present in number //power will be 1 2 4 8
			if (number < power) {

				System.out.print(0);
				array.remove(0);
				array.add(0);
			}
			// power is present in n, so subtract power from n
			else {
				System.out.print(1);
				number -= power;
				array.remove(0);
				array.add(1);
			}
			// next smarraylest power of 2
			power /= 2;
		}

		System.out.println("" + array);
		/*
		 * we do not get equivalent binary in array list so reverse arrayList
		 * because 2pow0 is given to highest position 2pow0 starts for lowest
		 * position
		 **/
		Collections.reverse(array);
		// System.out.println("reversed array" + array);
		int sum = Utility.getSumNibble(array);
		System.out.println("sum before swap=" + sum);
		return array;
	}

	/**
	 * 
	 * @param arrayList
	 *            array
	 * <p> divides array and print by swaping both parts 
	 */

	public static void swapNibbles(ArrayList<?> array) {
		int size = (array.size());
		int low = 0;
		int high = (array.size()) - 1;
		int mid = (low + high) / 2;
		int total;
		ArrayList<Integer> arrayswap = new ArrayList<Integer>(size);
		ArrayList<Integer> highnibble = new ArrayList<Integer>(size);
		ArrayList<Integer> lowernibble = new ArrayList<Integer>(size);
		System.out.println("mid  =" + mid);
		lowernibble = Utility.getNibble(array, mid + 1, high);
		highnibble = Utility.getNibble(array, low, mid);
		arrayswap.addAll(highnibble);
		arrayswap.addAll(lowernibble);
		System.out.println("new swap array =" + arrayswap);
		total = getSumNibble(arrayswap);
		System.out.println("total after swap " + total);

	}

	/**
	 * 
	 * @param array
	 *            having binary values
	 * 
	 * @param low
	 * @param mid
	 * @return total (eg 01000110 which is 70 in decimal.) return 70
	 * @author ragini
	 * 
	 */
	public static ArrayList<Integer> getNibble(ArrayList<?> array, int a, int b) {

		ArrayList<Integer> newarray = new ArrayList<Integer>(b);
		int retval;
		@SuppressWarnings("unused")
		int sum = 0;
		for (int i = a; i <= b; i++) {
			retval = (int) newarray.get(i);
			newarray.add(retval);
		}
		Collections.reverse(newarray);
		System.out.println(newarray);
		sum = Utility.getSumNibble(newarray);
		return newarray;
	}

	public static int getSumNibble(ArrayList<Integer> array) {
		int retval;
		int sum = 0;
		for (int i = 0; i <= array.size() - 1; i++) {
			retval = (int) array.get(i);
			if (retval == 1) {
				sum = sum + (int) (Math.pow(2, i));
			}

		}
		return sum;
	}

	/**
	 * @param no
	 *            parameter
	 * @return return long start Time
	 *
	 */
	public static long startTime, stopTime;

	public static long startStopWatch() {
		startTime = System.currentTimeMillis();
		return startTime;
	}

	/**
	 * 
	 * @param startTime
	 * @return elapsed time long
	 *<p>returns stopTime - startTime
	 */
	public static long elapsedTime(long startTime) {
		stopTime = System.currentTimeMillis();
		return (stopTime - startTime);
	}

	/**
	 * 
	 * @param int
	 *            string1
	 * @param int
	 *            string2
	 * @return true ->anagram
	 *         <p>
	 *         false->not anagram
	 */
	public static Boolean anagramChecker2(int number1, int number2) {
		String numberAsString1 = Integer.toString(number1);
		String numberAsString2 = Integer.toString(number2);
		boolean status = true;

		if (numberAsString1.length() != numberAsString2.length()) {
			status = false;
			// System.out.println("false");
		} else {
			char[] ArrayS1 = numberAsString1.toCharArray();
			char[] ArrayS2 = numberAsString2.toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			// System.out.println(number1 + " and " + number2 + " are
			// anagrams");
			return true;
		} else {
			// System.out.println(number1 + " and " + number2 + " are not
			// anagrams");
			return false;
		}
	}
}
