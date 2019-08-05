/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:	Bubble Sort and print the sorted list
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Scanner;

import com.bridgelabz.Algo_Utility.Algo_Utility;

public class BubbleSort {

	public static void main(String[] args) 
	{
			Algo_Utility utility=new Algo_Utility();
			
			int i,j,temp=0;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter how many numbers to be sorted:");
			int number=scanner.nextInt();
			 Algo_Utility.bubbleSort(number, temp);
		
	}
}
		
		

	

