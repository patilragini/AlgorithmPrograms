/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSortGeneric {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		    	//String[] stringArray = {"Hello", "World", "Hello"};
		       // Integer[] intArray = {1,4,9,0,8,7,9,6};
				Utility is = new Utility();
				System.out.println("Bubble Sort Generic \nChoose the type of Array:");
				System.out.println("1: Integer"); 
				System.out.println("2: Boolean");
				System.out.println("3: char");
				System.out.println("4: String");
				int choose=input.nextInt();
				
				System.out.println("enter size of array");
				int size=input.nextInt();
				
				if (choose == 1){
					Integer[] array = new Integer[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i]=input.nextInt();
					}
					is.doBubbleSortGeneric(array);
					Utility.printArray(array);
					
				}
				else if (choose == 2){
					Boolean[] array = new Boolean[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i]=input.nextBoolean();
					}
					Utility.printArray(array);
					is.doBubbleSortGeneric(array);
			        Utility.printArray(array);
				}
				else if (choose == 3){
					Character crr[]=new Character[size];
					 System.out.println("enter the string");
				        for(int i=0;i<size;i++)
				        {
				            char c=input.next().charAt(0);
				            crr[i]= c;
				        }
				        Utility.printArray(crr);
				        is.doBubbleSortGeneric(crr);
				       Utility.printArray(crr);
				     }
				else if (choose == 4){
					String[] array = new String[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i]=input.nextLine();
					}
					Utility.printArray(array);
					is.doBubbleSortGeneric(array);
			        Utility.printArray(array);
				}
				else 
					System.out.println("error ");
				
		
	}

}
