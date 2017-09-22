/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs.copy;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char type;
		try {
			do {
				System.out.println(" enter maximum number");
				int max_num = scanner.nextInt();
				System.out.println(" remmember any 1 number between 0 to " + (max_num - 1));
				Utility.guessNumber(0, max_num - 1);
				System.out.println("do you want to continue search/sort ? y/n");
				type = scanner.next().charAt(0);
			} while (type == 'y' || type == 'Y');
		} catch (Exception e) {
			System.out.println("Error Type Stop!!!");
		}
		scanner.close();
	}
}
