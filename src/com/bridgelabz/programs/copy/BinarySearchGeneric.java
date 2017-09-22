/*****************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs.copy;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchGeneric {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char type;
			do {
				System.out.println("Bubble Sort Generic \nChoose the type of Array:");
				System.out.println("1: Integer");
				System.out.println("2: char");
				System.out.println("3: String");
				int choose = scanner.nextInt();
				long currentTime;
				long elapsedTime = 0;
				boolean flag = false;
				System.out.println("enter size of array");
				int size = scanner.nextInt();
				System.out.println("\n enter array ");
				if (choose == 1) {
					currentTime = Utility.startStopWatch();
					Integer[] array = new Integer[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.nextInt();
					}
					System.out.println("enter element to search");
					int element = scanner.nextInt();
					flag = Utility.binarySearchGeneric(array, element);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
					Utility.printArray(array);
				} else if (choose == 2) {
					currentTime = Utility.startStopWatch();
					Character crr[] = new Character[size];
					System.out.println("enter characters");
					for (int i = 0; i < size; i++) {
						char c = scanner.next().charAt(0);
						crr[i] = c;
					}
					Utility.printArray(crr);
					System.out.println("enter element to search");
					char element = scanner.next().charAt(0);
					flag = Utility.binarySearchGeneric(crr, element);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
					Utility.printArray(crr);
				} else if (choose == 3) {
					String[] array = new String[size];
					currentTime = Utility.startStopWatch();
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.next();
					}
					Utility.printArray(array);
					System.out.println("enter element to search");
					String element = scanner.next();
					flag = Utility.binarySearchGeneric(array, element);
					Utility.printArray(array);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
				} else
					System.out.println("Error ");

				if (flag == true) {
					System.out.println("FOUND");
				} else
					System.out.println("NOT FOUND");

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
