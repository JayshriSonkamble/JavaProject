/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:	Print the year is a Leap Year or not.
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Leapyear {

public static void main(String[] args)
{
	
	int year;
	Utility utility=new Utility();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enetr calender year");
	year =scanner.nextInt();
	
	Utility.leapyearcalcu(year);
	
}
}	
		/*//int year;
		int year=Utility.integerInput();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr calender year");
		year =scanner.nextInt();
		
		leapyear(year);
}

 static  void leapyear(int year)
 {
	
	 	if (year!=0) 
	 	{
		 		if (year%400==0) 
		 		System.out.println("this is Leap year " +year);
		 
		 		else  if (year%100==0) 
		 
		 		System.out.println("This is not leap year "+year);
		 
		 		else if(year%4==0)
				 
		 		System.out.println("Leap year Present at calender");
			 else
				 System.out.println("leap year not Present in calender");                       
		 }
		 		else
		 			System.out.println("year not  exist "+year);        

	 }		
		
}
	 
 
 */
	 
 


