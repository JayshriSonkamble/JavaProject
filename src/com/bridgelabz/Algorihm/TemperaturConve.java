/******************************************************************************
 *  Compilation:  javac -d bin TempreatureConve.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:temperature in fahrenheit as input outputs the temperature in Celsius or viceversa using the formula	
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Scanner;

import com.bridgelabz.Algo_Utility.Algo_Utility;

		public class TemperaturConve extends Algo_Utility
		{

		public static void main(String[] args) 
		{
			double f,c;
			Algo_Utility utility=new Algo_Utility();
	        Scanner scanner=new Scanner(System.in);
		    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
	        int ch=scanner.nextInt();
		    switch(ch)
		    {
		    case 1:  System.out.println("Enter  Fahrenheit temperature");
	                   	  f=scanner.nextDouble();
	                   	Algo_Utility.Tempretureconversion(f,'c');
			break;
		    case 2:  System.out.println("Enter  Celsius temperature");
	                   	  c=scanner.nextDouble();
	                   	Algo_Utility.Tempretureconversion(c,'f');
			  break;
		    default:  System.out.println("please choose valid choice");
		   }
	}

}
