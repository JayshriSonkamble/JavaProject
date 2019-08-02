/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:   tomplay gambler and Print Number of Wins and Percentage of Win and Loss
 * @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Gambler
{
	public static void main(String[] args) 
	{
			int bits=0; int win=0, lose=0; float percentWin =0,percentLose=0;
		 
				Utility utility =new Utility();
				Scanner scanner = new Scanner(System.in);
			
				System.out.println("Enter Stake:");
		    	int stake = scanner.nextInt();
		    	
		    	System.out.println("Enter Goal:");
				int goal = scanner.nextInt();
				
				System.out.println("Enter number of times:");
				int number = scanner.nextInt();
				
				Utility.gamblerwinloss(goal, stake, win,number, percentWin, percentLose, bits);
	}
}
