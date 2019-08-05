/******************************************************************************
 *  Compilation:  javac -d bin Stopwatch.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:   Stopwatch Program for measuring the time that elapses between the start and end clicks
 *  			and  Print the elapsed time.
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;

public class Stopwatc{

		
		public static void main(String[] args) 
		
		{
		
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter start to start stopwatch:");
			String startime= scanner.next();
			
			 	long starttime = System.currentTimeMillis();
			 	Scanner scanner1= new Scanner(System.in);
			  
			 	System.out.println("Enter end to end stopwatch:"); String endtime=scanner1.next();
			  
			   //used to get current end time
			 	long endtime1 = System.currentTimeMillis();
			  
			 	//formula to calculate Elapsed time
			 	double time= (endtime1-starttime)/1000.0;//Convert milliseconds to seconds
			  
			 	System.out.println("Elapsed Time: "+time);
		}

	}

	