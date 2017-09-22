/******************************************************************************
 *  Compilation:  javac -d bin Binary .java
 *  Execution:    java -cp bin com.bridgelabz.util.Binary  
 *  
 *  Purpose: Prints out n in binary.
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 * Remarks
 * 1100100[0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0]
 *					sum before swap=100
 *					mid  =7
 *					[0, 0, 0, 0, 0, 0, 0, 0]
 *					[0, 1, 1, 0, 0, 1, 0, 0]
 *					new swap array =[0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 *					total after swap 38
 *   
 *  
 ******************************************************************************/

package com.bridgelabz.programs.copy;

import java.util.ArrayList;
import com.bridgelabz.utility.Utility;

/**
 * @author ragini patil
 **/
public class ToBinary {
	public static void main(String[] args) {
		// read in the command-line argument
		int n = Integer.parseInt(args[0]);
		System.out.println(n);
		// set power to the largest power of 2 that is <= n
		ArrayList<Integer> array = Utility.toBinary(n);
		Utility.swapNibbles(array);
	}

}