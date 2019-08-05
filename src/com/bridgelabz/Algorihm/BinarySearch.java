/******************************************************************************
 *  Compilation:  javac -d bin BinarySearch.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:	search the number to using BinarySearch 
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Scanner;

import com.bridgelabz.Algo_Utility.Algo_Utility;

public class BinarySearch 
{
	 public static void main(String args[])
	   {
		 Algo_Utility utility= new Algo_Utility();
		 
		 int counter, num, item, array[], first = 0, last = 0, middle = 0;
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      
	      num = scanner.nextInt(); 
	      array = new int[num];
	      System.out.println("Enter " + num + " integers");
	     
	      for (counter = 0; counter < num; counter++)
	      array[counter] = scanner.nextInt();
	      System.out.println("Enter the search value:");
	      item = scanner.nextInt();
	      Algo_Utility.BinarySearch(counter, num, item, array, first, last, middle);
	   }   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	