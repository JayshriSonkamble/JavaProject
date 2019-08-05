/******************************************************************************
 *  Compilation:  javac -d bin BinaryWordlist.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:	Binary Search the Word from Word List
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   28-07-2019
 *
 *****************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.Algo_Utility.Algo_Utility;

public class BinaryWordlist 
{
	  
	    public static void main(String []args) 
	    { 
	    	Algo_Utility utility=new Algo_Utility();
	    	
	        String[] arr = { "Hello","Bye","computer","Cat","apple","bag"}; 
	        String x = "Hello"; 
	        Algo_Utility.binarySearchword(arr, x); 
	       
	       int result =0;
	       if (result == -1) 
	            System.out.println("Given word list...the word not found"); 
	       else
	            System.out.println("Given word list...the word found at "+ "index " + result); 
	    } 
} 

		
	
	
	
		
	

