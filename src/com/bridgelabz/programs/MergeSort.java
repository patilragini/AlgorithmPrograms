/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   9-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		// String str2[]={"tag","aaa","bat","mat","cat","mat","fat"};
		Scanner scanner = new Scanner(System.in);
		try {
			char type;
			do {

				System.out.println("Enter number of string");
				int size;
				size = scanner.nextInt();
				String[] array = new String[size];
				System.out.println("enter stringsz..");
				for (int i = 0; i < size; i++) {
					array[i] = scanner.next();
				}
				array = Utility.mergeSort(array);
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				System.out.println("do you want to continue ? y/n");
				type = scanner.next().charAt(0);

			} while (type == 'y' || type == 'Y');
			System.out.println("stop!!!");
		} catch (Exception e) {
			System.out.println("Type Error!!!");

		}
		scanner.close();
	}

}
