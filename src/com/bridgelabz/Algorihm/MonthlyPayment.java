/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:	calculate principal amount year and intrest for monthlypayment  
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Scanner;

import com.bridgelabz.Algo_Utility.Algo_Utility;

public class MonthlyPayment
{

		public static void main(String[] args) 
		{
				Algo_Utility utility=new Algo_Utility();
				double priamount, year, interest,payment;
				Scanner scanner=new Scanner (System.in);
			    System.out.println("Enter the Principal amount:");
			    priamount=scanner.nextInt();
			    System.out.println("Enter the No.of years:");
			    year=scanner.nextInt();
			    System. out. println("Enter the Rate of  interest");
			    interest=scanner.nextFloat();
		
			   Algo_Utility.monthlyPayment(priamount, year, interest);
		        
		}
	}
	
