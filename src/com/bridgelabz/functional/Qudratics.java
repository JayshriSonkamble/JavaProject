/******************************************************************************
 *  Compilation:  javac -d bin Qudratic.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:  find the roots of the given equation the 2 roots of the equation can be found using a formula. 
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;

public class Qudratics 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a :");
		a=sc.nextInt();

		System.out.print("Enter b :");
		b=sc.nextInt();

		System.out.print("Enter c :");
		c=sc.nextInt();

		double x;
		double delta =b*b-4*a*c;

		double root1= (-b + Math.sqrt(delta))/(2*a);
		double root2= (-b - Math.sqrt(delta))/(2*a);

		System.out.println(root1);

		System.out.println(root2);
	

	}

}
