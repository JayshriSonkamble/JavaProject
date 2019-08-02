/**
 * @author jayshri
 *
 */
package com.bridgelabz.utility;
import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.KeySelector.Purpose;

public class Utility
{

	
	/**
	    * function to check Print the integervalue with User Name 
	    *
	    * @return interger value return with username
	    */
	 static Scanner scanner= new Scanner(System.in);
	
	 public static int integerInput()
	 {

		 int integerValue = scanner.nextInt();
		 return integerValue;
	 }
	 /**
	    * Function to check and print String with User Name 
	    *
	    * @return stringvalue return  with userName
	    */
	 public static String stringInput()
	 {

		 String stringValue = scanner.next();
		 
		 return stringValue;
	 }
	
	
	  boolean checkusername(String username)
	  {
		  	if(username.length()>=3) 
		  { 
			  System.out.println("fixed charachter length");
			  System.out.println("not fixed length ");
	  
			  return true; 
		  }
		  	return false; 
	  }
	 
	 /**
	    * Function to check integer percenet and randum number print filpscoin value
	    * @param heads and tails to increment the random number 
	    * @param counter to count the random number of flips coin 
	    * @param randNum to chcek the randum number heads abd tails
	    * 
	    */
	 public static void flipscoin(int heads,int tails,int counter,double randNum)
	 {
		 System.out.println("How many times we will fliped");
         int flips=scanner.nextInt();
        
         while(counter <= flips)                        
         {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum < 0.5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
             }
            counter++;      
        }

       System.out.println();
       System.out.println("Number of Heads = " + heads);
       System.out.println("Number of Tails = " + tails);
       
	}
	 /**
	    * Function to check calender print leap year or not lear pear
	    *
	    *@param to call the condition and print leap year 
	    * 
	    */
public static int leapyearcalcu(int year)

{
	//System.out.println("Enetr calender year");
		if (year!=0) 
	 	{
			if (year%400==0) 
	 		System.out.println("this is Leap year at" +year);
			
			else  if (year%100==0) 
			System.out.println("This is not leap year "+year);
			
			else if(year%4==0)
			System.out.println("Leap year Present in calender");
			else
			 System.out.println("leap year not Present in calender");                       
		}
			else System.out.println("year not  exist "+year);
		return year;     
}

/**
	 * Function to check power of input value
	 *
	 *@param number to chcek the less value
	 * @param power to call enterd number 
   */
	public static void powerof(int number,int power)
	{	
		
		for(int i=0;i<=number;i++)				
		{
			System.out.println("Power of " +i+ " " +power);
			power = 2*power;
		}
	}
	 /**
	    * Function to check harmonicSeries and print harmonic value
	    *
	    *@param interger number and result to check output of harmonic values and result
	    * @return harmonic value return the result is 0
	    * 
	    */
	
	public static  int harmonicSeries(int number)
	{
		
		 String series = "1";
		  
		  for(int temp = 2;temp <= number; temp++)
		  {
			  series += "+(1/"+temp+")";	 
		  }
		  System.out.println("Nth Harmonic Series  "+series+"\n");
		  
		  double result = 0;
		  
		  for(int temp = number;temp > 0; temp--)
		  {
			  result = result+((double)1/(double)temp);	 
			System.out.println("Harmonic Series value are " +number+ "is " +result);
		  }
		return 0;
	}
	
	/**
	 * Purpose find the entered prime number of factorial number  
	 * @param number to calculate the prime factorial
	 *
	 * */		
	public static void findprimefactor(int n)
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
		}
	}
	/**
	 * Function to call and check the gambler of win and loss
	 * @param win and loss to check the win and loss 
	 * @param win tom chcek number of win 
	 * @param to chack the how many goal and stack in this game
	 * @param percentwin and loss to calculate the percentage of win and loss number
	 **/
	public static void gamblerwinloss(int goal,int win, int stake, int number, float percentWin, float percentLose, int bits)
	{	
		Scanner scanner = new Scanner(System.in);
			if(stake <= goal)
			{
				for(int i=0; i<number; i++)
				{
					int money=stake;
					while(money>0 && money < goal)
					{
						bits++;
						//Used random() function for Generating random number to win or lose
						if(Math.random() > 0.5)
						{
							money++;
						}
						else {
						money--;
						}
					}
					if(money==goal)
					{
						number++;
					}
				}
			int lose = number - win;
			//Formula for Calculating Percentage and Averages
			percentWin = (float)win/number*100;
			percentLose = (float)lose/number*100;
	
			System.out.println("Total number of wins: "+win);
			System.out.println("Total number of lose: "+lose);
			System.out.println("Percentage of win: "+percentWin);
			System.out.println("Percentage of lose: "+percentLose);
			
			if(number > lose )
			{
				System.out.println(" you are Winner!!");
			}
			else
			{
				System.out.println("you are loser!!");
			}
		}
			else 
			{
				System.out.println("Invalid Input. Please enter stake greater than zero");
		}
			scanner.close();
			return;
	}
/**
	 * method to generate random number and to call distinctcoupon number
	 * 
	 *@param Generating Random Numbers for entered Coupon Number
	 *@return collected random number to return the couon number of count
	 * 
	 * */
	public static int distinctcoupon(int coupon)
	{
		int distinct = 0, count = 0;
		int[] collected = new int[coupon];
		Random randomnumber = new Random();
	
			for(int i=1; i<=coupon; i++)
			{
				int randomnum= randomnumber.nextInt(1000);
				System.out.println("Generating Random Numbers for entered Coupon Number \n"+randomnum);
			}
			while(distinct < coupon)
			{
				int value = (int) (Math.random()*coupon);
				count++;
				if(collected[value]!=1)
				{
				distinct++;
				collected[value]=1;
				}
			}
	System.out.println("Total no of trials to get "+coupon+" different coupon number's are "+count);
	scanner.close();
	return count;
	}
	
	/**
	  *method call the array of row and colum
	  *@param colum to check the array of interger value
	  * @return row to call the array ogf interger value
	    * 
	    */
	public static void twodimArray(int colum,int row)
	{	
		int i,j;
		int array[][]=new int[4][4];
		System.out.println("enter "+(colum*row)+ "array elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colum;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
				 
		//print 2dimentions array 
		System.out.print("array is \n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colum;j++)
			{	System.out.print(array[i][j]+ " ");
			}
			System.out.println();
			}
		return;
	}
/**
	 * Purpose initialization of array to declare the sum of three interger and calculate the array 
	 * @param array to calculate the sum of triplet values
	 * @param interger of size to call the sum of array element size
	 * */
	public static void sumofThree(int arr[],int size)
	{	
			int sum=0;
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					for(int k=j+1;k<size;k++)
					{
						if(arr[i]+arr[j]+arr[k] ==0)
						{	
							System.out.println("sum of triplet values are \n");
							System.out.println(arr[i]+ " + " +arr[j]+ " + " +arr[k]+ " = 0");
						}
					}
				}
				
			}
		}

		/*public static void main(String[] args) {
			int arr[]={0,-1,2,-3,1};
			int size=arr.length;
			
			sumofTriplet(arr,size);*/
/**
	 * Purpose calculate the distance from twp point prints the Euclidean distance from the point
	 * @param argumnet to call command line integer and print the value
	 * @param calculate tne distance from the two point that is x and y
	 * */			
public static void distancepoint(String args[],double distance)
{
		int x,y;
		x =Integer.parseInt(args[0]);
		y =Integer.parseInt(args[1]);
	 
	
		distance =Math.sqrt((Math.pow(x*y, x)+Math.pow(y*y, y)));
	 
	System.out.println("distance from the point (" + x + ", " + y + ") to origin(0, 0) = " + distance);
}
/**
 * Purpose calculate the distance from twp point prints the Euclidean distance from the point
 * @param argumnet to call command line integer and print the value
 * @param calculate tne distance from the two point that is x and y
 * */	

public static void windchill(double temperature,double windspeed,String args[])
{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		if(temperature<=50 && windspeed>3 || windspeed<120)
		{
		double windchill =  35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)* Math.pow(windspeed, 0.16);
		System.out.println("Windchill of given temperature and windspeed:"+windchill);
		}
	}
}
