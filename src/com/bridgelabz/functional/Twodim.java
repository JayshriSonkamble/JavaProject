/******************************************************************************
 *  Compilation:  javac -d bin Twodimen.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:  array using colum and row and print the two dimention array. 
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Twodim
{

public static void main(String[] args) 
{
		Utility utility=new Utility();
		int row,colum;
		//int arr[][]=new int[4][4];
		
		Scanner Scanner= new Scanner(System.in);
		
	//enter row and colum for array
		System.out.println("enter row for array");
		row=Scanner.nextInt();
		
	//enter colum and row for array
		System.out.println("enter colm for array");
		colum=Scanner.nextInt();
		
		
		Utility.twodimArray(colum, row);
	}
}
	



	