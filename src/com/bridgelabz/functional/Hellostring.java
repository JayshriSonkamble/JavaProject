/******************************************************************************
 *  Compilation:  javac -d bin HelloString.java
 *  Execution:    java -cp bin com.bridgelabz.util.HelloString
 *  
 *  Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class Hellostring
{

	public static void main(String[] args)
	{
			System.out.println("enter Original String ");
			String name = Utility.stringInput();
			int name1 = Utility.integerInput();
			String  checkusername= Utility.stringInput();
 			  
			  System.out.println("hello" +name1+ "how are you");
			  System.out.println("hello" +name+ "how are you");
			 
	}			  
			  
		
}	
		 

		
	




  
 