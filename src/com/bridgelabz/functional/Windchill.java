/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.functional
 *  
 *  Purpose:  calculte the temperature (in Fahrenheit) and the wind speed(in miles per hour) using formula.
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Windchill {

			public static void main(String[] args)
			{
					Utility utility=new Utility();
					double temperature = Double.parseDouble(args[0]);
					double windspeed = Double.parseDouble(args[1]);
					
					Utility.windchill(temperature, windspeed, args);
					 
					/*for(int i=0; i<args.length; i++)
					{
						System.out.println(args[i]);}
				if(temperature<=50 && windspeed>3 || windspeed<120)
					{
						double windchill =  35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)* Math.pow(windspeed, 0.16);
						System.out.println("Windchill of given temperature and windspeed:"+windchill);*/
					}
			}

	

	