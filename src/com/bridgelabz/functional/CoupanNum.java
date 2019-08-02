/******************************************************************************
 *  Compilation:  javac -d bin CoupanNum.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:	Functions to generate random number and to process distinct coupons.
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class CoupanNum 
{

	public static void main(String[] args) 
	{
			
				Utility utility=new Utility();
				//Creating instance of Random Class
			//	Random randomnumber = new Random();

				Scanner scanner= new Scanner(System.in);
				System.out.println("Enter Coupon Number:");
				int coupon = scanner.nextInt();
				
				Utility.distinctcoupon(coupon);
				
		/*
		 * int distinct = 0, count = 0; int[] collected = new int[coupon];
		 * 
		 * for(int i=1; i<=coupon; i++) { int randomnum= randomnumber.nextInt(1000);
		 * System.out.println("Generating Random Numbers for entered Coupon Number:"
		 * +randomnum); } while(distinct < coupon) { int value = (int)
		 * (Math.random()*coupon); count++; if(collected[value]!=1) { distinct++;
		 * collected[value]=1; } } System.out.println("Total no of trials to get "
		 * +coupon+" different coupon number's are "+count);
		 * 
		 * scanner.close();
		 */
			}

			
	}

