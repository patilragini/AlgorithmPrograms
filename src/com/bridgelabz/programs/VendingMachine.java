/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   8-09-2017
 *@purpose : accepts amount from user and prints equivalient change 
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char type;
			do {
				System.out.println("enter amount for change");
				int change = scanner.nextInt();
				int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
				int noteCount[] = new int[notes.length];
				if (change > 0) {
					Utility.giveChange(noteCount, change, 0);
					//loop
					for (int i = 0; i < notes.length; i++) {
						if (noteCount[i] != 0)
							System.out.println(notes[i] + " Rs note= " + noteCount[i]);
					}
				} else
					System.out.println("no change");
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
