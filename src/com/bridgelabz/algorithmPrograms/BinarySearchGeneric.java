/* ****************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/package com.bridgelabz.algorithmPrograms;

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
				boolean flag = false;
				System.out.println("enter size of array");
				int size = scanner.nextInt();
				System.out.println("\n enter array in ascending order");
				if (choose == 1) {

					Integer[] array = new Integer[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.nextInt();
					}
					System.out.println("enter element to search");
					int element = scanner.nextInt();
					flag = Utility.binarySearchGeneric(array, element);
					Utility.printArray(array);
					flag = true;
				} else if (choose == 2) {
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
					Utility.printArray(crr);
					flag = true;
				} else if (choose == 3) {
					String[] array = new String[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i] = scanner.next();
					}
					Utility.printArray(array);
					System.out.println("enter element to search");
					String element = scanner.nextLine();
					flag = Utility.binarySearchGeneric(array, element);
					Utility.printArray(array);
					flag = true;
				} else
					System.out.println("Error ");

				if (flag == true) {
					System.out.println("FOUND");
				} else
					System.out.println("NOT FOUND");

				System.out.println("do you want to continue ? y/n");
				type = scanner.next().charAt(0);

			} while (type == 'y' || type == 'Y');

		} catch (Exception e) {
			System.out.println("Error Type");
		}
		scanner.close();
	}

}
