/******************************************************************************
 *  Compilation:  javac -d bin UtilityClass.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm
 *  
 *  Purpose:	UtilClass insert the binaryserach,insertion,bubbleSort
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;
import java.util.Arrays;

public class UtilityClass extends Utilityclass_main 
{

	public static void main(String[] args)
	{
		//binarySearch method for String
		  
		  String array[] ={"EWRSFSFSFSB","BB","AA","SDFSFJ","WRTG","FF","ERF","FED","TGH"}; 
		  String search = "cc";
		  
		  Arrays.sort(array);
		  int searchIndex = String(array,search);
		  System.out.println(searchIndex != -1 ? array[searchIndex]+ " - Index is "+searchIndex : "searched element not found \n");
		 
		 
		  //binarySearch method for integer

		/*
		 * int[] arr = { 2, 4, 5, 6, 8, 9, 11, 15, 17, 19, 22, 111, 117, 234, 543 };
		 * 
		 * int search = 111;
		 * 
		 * int size = arr.length;
		 * 
		 * if (search == -1) { System.out.println("Element not found"); } else {
		 * System.out.println("Element found at index" + search);
		 * 
		 * }
		 */

	// insertionSort for integer
		  
		  int[] arr1 = {10,34,2,56,7,67,88,42};
	       int[] arr2 = InsertionSort(arr1);
	       System.out.println("insertion sorted element ");
	        for(int i:arr2)
	        {
	            
	            System.out.print(i);
	            System.out.print(",");
	            
	          
	        }
	        
	    //insertion sort for string
	        
	        String[] stringArray = {"beta", "gamma", "alpha", "epsilon", "delta"};
	          // test array
	          System.out.println("\n before sorted array");
	          for(String element: stringArray)
	          System.out.print(element + "\n ");
	          System.out.println();

	          insertionSort(stringArray);

	          System.out.println("after Sorted array:");
	          for(String element: stringArray)
	                System.out.print(element + " \n");
	          System.out.println();
	       
	        
	   //bubbleSort method for integer
	          
	          int arr[] ={3,60,35,2,45,320,5};  
              
              System.out.println("Array Before Bubble Sort");  
              for(int i=0; i < arr.length; i++)
              {  
                      System.out.print(arr[i] + " ");  
              }  
              System.out.println();  
                
              bubbleSort(arr);//sorting array elements using bubble sort  
               
              System.out.println("Array After Bubble Sort");  
              for(int i=0; i < arr.length; i++)
              {  
                      System.out.print(arr[i] + " ");  
	         
              }
              
              //BubbleSort method for String
              
              String[] array1 = { "Aanar", "Banana", "Cake", "Papaya", "Grapes" }; 
              int n = array1.length; 
              sortStrings(array1, n); 
              
             System.out.println("\n Strings in sorted order are :"); 
            
              for (int i = 0; i < n; i++) 
            	  System.out.println(array1[i]);

	}

	
		
	}




