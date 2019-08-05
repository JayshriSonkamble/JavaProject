/******************************************************************************
 *  Compilation:  javac -d bin ANagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 * Purpose:	Anagram detection to write theAnagram, Palindrome, Prime Numbers, Search Algos, Sort Algos.
 *@author  	Jayshri
 *@version 	1.0
 *@since   	28-07-2019
 *******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Scanner;

public class ANgramDetection {

	public static void main(String[] args)
	{
			
		int number1,number2,number3;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Armstrong Number ");  
		
		number1=scanner.nextInt();		
		for (int i = 1; i <= number1; i++) 
		{  
			if (Armstrong(i) == true)
			{  
			  System.out.print(i + " "); 
			  //System.out.println("Armstrong Numbers 1 to 1000are..");
	   
			}  
		}  
	  		System.out.println("\n enter Palindrome Numbers 100 to 300 ");  
	  		number2=scanner.nextInt();
	  		
	  		for (int j = 100; j <= number2; j++)
	  		{  
	  			if (Palindrome(j) == true) 
	  			{  
	  				System.out.print(""+j + " ");  
	  			}  
	  		}  
	  		System.out.println("\n enter Prime Numbers up to 100 "); 
	  		number3=scanner.nextInt();
	  		for (int k = 0; k <= number3; k++)
	  		{  
	  			if (Prime(k) == true) 
	  			{  
	  				System.out.print( k + " ");  
	  			}  
	  		}  
	 }  
 public static boolean Armstrong(int num)
{  
	 	int num1 = num;  
	 	/* Converting Integer to String. It'll help to find number of 
	  	digits in the Integer by using length() */  
	 	String str = Integer.toString(num);  
	 	int rem;  
	 	int result = 0;  
	 	while (num > 0) 
	 	{  
	 		rem = num % 10;  
	 		num = num / 10;  
	 		result = result + ((int) Math.pow(rem, str.length()));  
	 	}  
	  		if (result == num1) 
	  		{  
	  			return true;  
	  			} else {  
	  				return false;  
	  		}  
}  
 
public static boolean Palindrome(int num)
{  
	  int num1 = num;  
	  int rem;  
	  int result = 0;  
	  while (num > 0)
	  {  
		  rem = num % 10;  
		  num = num / 10;  
		  result = (result + rem) * 10;  
	  }  
	  result /= 10;  
	  	if (result == num1)
	  	{  
	  		return true;  
	  } else {  
	   return false;  
	  }  
	 }  
	 public static boolean Prime(int num) 
	 {  
		 if (num < 2)
		 {  
			 return false;  
		 }  
		 int div = num / 2;  
		 for (int i = 2; i <= div; i++) {  
			 if (num % i == 0) {  
				 return false;  
			 }  
		 }  
		 return true;  
	 }  
}  


