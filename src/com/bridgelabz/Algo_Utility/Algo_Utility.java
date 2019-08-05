/**
 * @author jayshri
 *
 */
package com.bridgelabz.Algo_Utility;
import java.util.Arrays;
import java.util.Scanner;

public class Algo_Utility
{
/**
 * Purpose formula Celsius to Fahrenheit and Fahrenheit to Celsius to calculate the tempreture 
 *  @param temp to calculate farenhit and celsius tempreture
 *  @param initialization of charachter m to call the both farenhit and celsius  
 * */
		public static void Tempretureconversion(double temp,char m)
		{
			if (m=='f')
			{
				double f=((9*temp)/5)+32;
				System.out.println("farenhit"+f);
			}
			else if(m=='c')
			{ 
				double c=(temp-32)*5/9;
				System.out.println("celsius"+c);
			}
		}

/**
 * Purpose formula Celsius to Fahrenheit and Fahrenheit to Celsius to calculate the tempreture 
 *  @param temp to calculate farenhit and celsius tempreture
 *  @param initialization of charachter m to call the both farenhit and celsius  
 * */
	
	public static double monthlyPayment(double priamount,double years,double interest)
	{	
			double payment;
			interest=interest/(12*100);  
			years=years*12; 
  
			payment= (priamount*interest)/(1-Math.pow(1+interest/(12*100),12*years));
			return payment;
		
	}

/**
 * Purpose to call the sqrt to compute the square root of a nonnegative number c using Newton's method
 * @param  print out the estimate of the square root of c
 *  @return t, return the square root value
 * */
	public static double Sqrt(double c)
	{
	
			double epsilon = 1e-15;   
			double t = c ;            

			while (Math.abs(t - c/t) > epsilon*t)
			{
				t = (c/t + t) / 2.0;
			}
		return t;
		
}
	/**
	 * Purpose to call Binary Search method to search the array of integer element
	 * @param  array of element to call the first element, last and find the middle element
	 * @param to search the middle element of the given number
	 * @return first integer element to return the array of element
	 * */
public static int BinarySearch(int counter,int num,int item,int array[],int first, int last,int middle)
{
		first = 0;
		last = num - 1;
		middle = (first + last)/2;
	
		while( first <= last )
		{
		if ( array[middle] < item )
			first = middle + 1;
		else if ( array[middle] == item )
		{
				System.out.println(item + " found at location " + (middle + 1) + ".");
		break;
		}else
		{		last = middle - 1;
			
		}
				middle = (first + last)/2;
		}
		if ( first > last )
		System.out.println(item + " is not found.\n");
		return first;
}

 /**
	 * Purpose to call Binary Search the Word from Word List
	 * @param  array of element to call the first element, last and find the middle element
	 * @param last and first number to find the array of middle number
	 * 
	 * */
 public static int binarySearchword(String[] arr, String x) 
 { 
     int l = 0, r = arr.length - 1; 
     while (l <= r) { 
         int m = l + (r - l) / 2; 

         int res = x.compareTo(arr[m]); 

         // Check if x is present at mid 
         if (res == 0) 
             return m; 

         // If x greater, ignore left half 
         if (res > 0) 
             l = m + 1; 

         // If x is smaller, ignore right half 
         else
             r = m - 1; 
     } 

     return -1; 
 } 
 /**
	 * Purpose to check strings are anagram or not
	 * @param first and last string char to check the length of the string are equal or not and then sorted
	 * @return if both string are equal then statement true or both strings are not equal then statement false
	 * 
	 * */	
public static boolean isAnagrams(String first,String second)
{
		if(first.length()!=second.length())
		return false;
		
		char[] firstArray1 = first.toCharArray();
		char[] secondArray2 = second.toCharArray();
             
		Arrays.sort(firstArray1);
		Arrays.sort(secondArray2);
    
		String sortfirst1 = new String(firstArray1);
		String sortsecond2 = new String(secondArray2);
    
		if(sortfirst1.equals(sortsecond2))
		{
        return true;
     }
		else{
        return false;
     } 
 }
/**
	 * Purpose to call array of element to printing the sorted array  
	 * @param number to enter the sorted number
	 * 
	 * */	
public static void bubbleSort(int number,int temp)
{
		int i,j;
		int arr[]=new int[number];
		System.out.println();
		System.out.println("Enter value for "+number+" numbers:");

		for(i=0;i<arr.length;i++)       
		{	
			arr[i]=scanner.nextInt();		//taking input from user
		}

		for(i=0;i<arr.length;i++)         //sorting the array
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		System.out.println();
		System.out.println("The sorted order is:");
		for(i=0;i<arr.length;i++)      
		{
			System.out.println(arr[i]);		//printing the sorted array
}
		return;
		
}
}
	
