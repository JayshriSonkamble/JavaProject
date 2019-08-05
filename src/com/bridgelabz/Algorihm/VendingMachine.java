/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:	Find the Fewest Notes to be returned for Vending Machine
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   28-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Scanner;

public class VendingMachine 
{
	public static void vendingmachine(int cash)
			{	//Initializing array
				int[] notes=new int[8];
				notes[0]=1000;
				notes[1]=500;
				notes[2]=100;
				notes[3]=50;
				notes[4]=10;
				notes[5]=5;
				notes[6]=2;
				notes[7]=1;
				
				int[] counter = new int[8];
			
				//for Counting used for loop
				for(int i=0; i<8; i++)
				{
					if(cash >= notes[i])
					{
						counter[i] = cash / notes[i];
						cash = cash - counter[i] * notes[i];
					}
				}
				System.out.println("Display Notes Count used: ");
				for(int i=0; i<8; i++)
				{
					if(counter[i]!=0)
					{
						System.out.println(notes[i]+" : "+counter[i]);
					}
					
				}
			}
			public static void main(String[] args) 
			{
				Scanner object = new Scanner(System.in);
				System.out.println("Enter Amount: ");
				int cash = object.nextInt();
				vendingmachine(cash);
				object.close();
			}
		}

