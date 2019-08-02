/******************************************************************************
 *  Compilation:  javac -d bin PowerTwo.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:  prints a table of the powers of 2 that are less than or equal to 2^N.
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class PowerTwo 
{

	public static void main(String[] args) 
	{
		
		Utility utility=new Utility();
	
		int number=Integer.parseInt(args[0]);
		int power=1; 							// the ith power of two
		Utility.powerof(number, power);
	}
				 
} 
	
