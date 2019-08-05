/******************************************************************************
 *  Compilation:  javac -d bin Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose: this program checkes if two strings are anagram or not
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.Algo_Utility.Algo_Utility;

public class Anagram 
{
	
	public static void main(String args[])
	{
		Algo_Utility utility=new Algo_Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string");
		String first=scanner.nextLine();
	
		System.out.println("Enter second string");
		String second=scanner.nextLine();
		
		if(Algo_Utility.isAnagrams(first,second)) 
		{
		System.out.println("Both Strings are Anagram Strings...");
    	}
    	else{
        System.out.println("Both Strings are not Anagram...");
      
    }

	}
}

	
	
		  