package com.bridgelabz.programs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class SearchWordFromFile {
	public static void main(String[] args) throws IOException {
		// System.out.println("readinig);
		Scanner scanner = new Scanner(System.in);
		char type = 'y';
		try {
			ArrayList<String> list = new ArrayList<String>();
			list = Utility.printFile();
			Collections.sort(list);
			do {
				System.out.println("ENTER WORD TO SEARCH FROM FILE");
				String word = scanner.next();
				Utility.findWordFromFile(list, word);
				System.out.println("do you want to continue search/sort ? y/n");
				type = scanner.next().charAt(0);
			} while (type == 'y' || type == 'Y');
			System.out.println("stop");
		} catch (Exception e) {
			System.out.println("Error Type Stop!!!");
		}
		scanner.close();
	}

}