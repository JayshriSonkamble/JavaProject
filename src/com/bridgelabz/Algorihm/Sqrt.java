/******************************************************************************
 *  Compilation:  javac -d bin Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:Sqrt to compute the square root of number c given in the input using Newton's method
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import com.bridgelabz.Algo_Utility.Algo_Utility;

public class Sqrt 
{

	public static void main(String[] args) 
	{
		double c=Double.parseDouble(args[0]);
        double epsilon = 1e-15;   
        double t = c;              

        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }
        // print out the estimate of the square root of c
        System.out.println("Square root value of c \n");
        System.out.println(t);
        
        Algo_Utility.Sqrt(c);
        
        
    }
	
}