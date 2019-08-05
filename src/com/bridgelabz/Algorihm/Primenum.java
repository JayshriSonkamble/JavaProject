/******************************************************************************
 *  Compilation:  javac -d bin PrimeNum.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:	Print the Prime number
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;

public class Primenum {

	public static void main(String[] args)
	{
		
		
		System.out.println("Prime Numbers 0 to 100 ");  
		  for (int i = 1; i <= 100; i++) {  
		   if (Prime(i) == true) 
		   {  
		  System.out.println(i + " ");  
		   }
		  }
	}
		   public static boolean Prime(int num) 
		   {  
			   if (num < 2) 
			   {  
			    return false;  
			   }  
			   int div = num / 2;  
			   for (int i = 2; i <= div; i++) 
			   {  
			    if (num % i == 0) 
			    {  
			     return false;  
			    }  
			   }  
			   return true;  
			  }  
		  }
/*	System.out.println("Enter prime num");
boolean b;
for (int j = 0; j <= 100; j++) {
	b = true;
	for (int i = 2; i < j / 2; i++) {
		if (j % i == 0) {
			b = false;
			break;
		}
	}
	if (b)
		System.out.print(j + " \n");
}
}

}
*/