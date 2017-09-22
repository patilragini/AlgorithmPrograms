
/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs.copy;

import java.util.Scanner;

public class SearchAndSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char type;
			do {
				System.out.println("MENU\n1.bubbleSort method method \n2.insertionSort method \n3.binarySearch");
				int choose = scanner.nextInt();
				switch (choose) {
				case 1:
					InsertionSortGeneric.main(null);
					break;
				case 2:
					BubbleSortGeneric.main(null);
					break;
				case 3:
					BinarySearchGeneric.main(null);
					break;
				case 4:
					System.out.println("error");
				default:
					System.out.println("invalid");
				}
				System.out.println("do you want to  search/sort Menu? y/n");
				type = scanner.next().charAt(0);
			} while (type == 'y' || type == 'Y');
		} catch (Exception e) {
			System.out.println("Error Type Stop!!!");
		}
		scanner.close();
	}
}
