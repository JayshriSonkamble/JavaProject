package com.bridgelabz.Algorihm;

public class Utilityclass_main 
{
	
//binary search for String
	public static int String (String[] a, String x) 
	{
	    	int low = 0;
	    	int high = a.length - 1;
	    	int mid;

	    	while (low <= high) 
	    	{
	    		mid = (low + high) / 2;
	    	if (a[mid].compareTo(x) < 0)
	        {
	            low = mid + 1;
	        } else 
	        if (a[mid].compareTo(x) > 0) 
	        {
	        	high = mid - 1;
	        } else {
	            return mid;
	        }
	    }
	    	return -1;
	}
	
//binary search for interger
	public int integer(int[] arr, int size, int search)
	{
	    	int start = 0;
	    	int end = size - 1;

	    	while (start <= end)
	    	{
	    		int mid = (start + end) / 2;
	    		if (arr[mid] == search)
	    		{
	    			return mid;
	    		} else if (arr[mid] < search)
	    		{
	    			end = mid - 1;

	    		} else {
	            start = mid + 1;
	        }
	    }
	    	return -1;

  }	  

//insertionSort method for integer
	
	 public static int[] InsertionSort(int[] input)
	 {
          int temp;
	      for (int i = 1; i < input.length; i++) 
	      {
	    	  for(int j = i ; j > 0 ; j--)
	            {
	                if(input[j] < input[j-1])
	                {
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	     return input;
	    }
	 
//insertionSort method for String
	 
	 public static void insertionSort(Comparable[] array)
     {
          Comparable temp;
          for(int i = 1; i < array.length; i++) // ar[i] is element to insert
          {
               temp = array[i];
               int j = 0;
               for(j = i; j > 0; j--)
                    if(temp.compareTo(array[j - 1]) < 0)
                         array[j] = array[j - 1];
                    else
                        break;
               array[j] = temp;
          }
     }
	 
//bubbleSort method for integer
	 
	 public static void bubbleSort(int arr[])
	 {
		 int n = arr.length;  
		 int temp = 0;  
		 for(int i=0; i < n; i++)
		 {  
			 for(int j=1; j < (n-i); j++)
			 { 
				 if(arr[j-1] > arr[j])
				 {		
					 //swap elements  
					 temp = arr[j-1];
					 arr[j-1] = arr[j];  
					 arr[j] = temp;  
				 }  
			 }
		 }      
	 }
	
//bubbleSort Method for string
	public static void sortStrings(String[] arr, int n)  
    { 
			String temp; 
  
			// Sorting strings using bubble sort 
			for (int j = 0; j < n - 1; j++) 
			{ 
				for (int i = j + 1; i < n; i++)  
				{ 
					if (arr[j].compareTo(arr[i]) > 0) 
					{ 
						temp = arr[j]; 
						arr[j] = arr[i]; 
						arr[i] = temp; 
					}
				}
			}
     	}
	}
	  
	   
	
		
		
		
	




