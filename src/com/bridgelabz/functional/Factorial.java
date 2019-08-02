/******************************************************************************
 *  Compilation:  javac -d bin Factorial.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:	Print the prime factors of number N
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Factorial {

	public static void main(String[] args)
	{
		Utility utility =new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		
		int n=scanner.nextInt();
		 Utility.findprimefactor(n);
	}

	/*public static void findprimefactor(int n)
	{
		while (n%2==0)
		{
			System.out.println("2"+" ");
			n/=2;
		}
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i+"");
				n=n/i;
			}
		}
		if(n>2)
		{
			System.out.println(n);
		}*/
	}

	

