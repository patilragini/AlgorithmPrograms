/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs.copy;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSortGeneric {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// String[] stringArray = {"Hello", "World", "Hello"};
		// Integer[] intArray = {1,4,9,0,8,7,9,6};
		try {
			char type;
			do {
				System.out.println("Bubble Sort Generic \nChoose the type of Array:");
				System.out.println("1: Integer");
				System.out.println("2: Boolean");
				System.out.println("3: char");
				System.out.println("4: String");
				int choose = scanner.nextInt();
				long currentTime;
				long elapsedTime = 0;

				System.out.println("enter size of array");
				int size = scanner.nextInt();
				System.out.println("enter elements in array");
				if (choose == 1) {
					currentTime = Utility.startStopWatch();
					Integer[] array = new Integer[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.nextInt();
					}
					Utility.doBubbleSortGeneric(array);
					Utility.printArray(array);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");

				} else if (choose == 2) {
					currentTime = Utility.startStopWatch();
					Boolean[] array = new Boolean[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.nextBoolean();
					}
					Utility.printArray(array);
					Utility.doBubbleSortGeneric(array);
					Utility.printArray(array);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
				} else if (choose == 3) {
					currentTime = Utility.startStopWatch();
					Character crr[] = new Character[size];
					System.out.println("enter the string");
					for (int i = 0; i < size; i++) {
						char c = scanner.next().charAt(0);
						crr[i] = c;
					}
					Utility.printArray(crr);
					Utility.doBubbleSortGeneric(crr);
					Utility.printArray(crr);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
				} else if (choose == 4) {
					currentTime = Utility.startStopWatch();
					String[] array = new String[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.nextLine();
					}
					Utility.printArray(array);
					Utility.doBubbleSortGeneric(array);
					Utility.printArray(array);
					elapsedTime = Utility.elapsedTime(currentTime);
					System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
				} else
					System.out.println("error ");

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
