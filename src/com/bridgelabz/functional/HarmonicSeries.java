/******************************************************************************
 *  Compilation:  javac -d bin HarmonicSeries.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:   tomplay gambler and Print Number of Wins and Percentage of Win and Loss
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class HarmonicSeries {

	public static void main(String[] args) 
	{
		Utility utility =new Utility();
		
		Scanner scanner= new Scanner(System.in); 
		System.out.println("Enter Harmonic Number ");
		int number=scanner.nextInt();
		
		
		Utility.harmonicSeries(number);
		
		/*
		 * //int number = scanner.nextInt(); int number=Utility.integerInput();
		 * 
		 * String series = "1";
		 * 
		 * for(int temp = 2;temp <= number; temp++) { series += "+(1/"+temp+")"; }
		 * System.out.println("Harmonic Series  "+series+"\n");
		 * 
		 * double result = 0;
		 * 
		 * for(int temp = number;temp > 0; temp--) { result =
		 * result+((double)1/(double)temp); }
		 * System.out.println("Harmonic Series Output for Number " +number+ "is "
		 * +result);
		 */
	}
		 
}

