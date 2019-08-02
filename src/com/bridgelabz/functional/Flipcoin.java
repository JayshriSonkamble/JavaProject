/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *Purpose:Flip Coin and print percentage of Heads and Tails
 *@author  Jayshri
 * @version 1.0
 * @since   29-07-2019
 *
 ******************************************************************************/package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class Flipcoin {

	public static void main(String[] args) {

		int heads = 0; int tails = 0; int counter = 1; double randNum = 0.0;
		 
		Utility utility=new Utility();
		
		Scanner scanner=new Scanner(System.in);
		
		Utility.flipscoin(heads, tails, counter, randNum);



	}

}