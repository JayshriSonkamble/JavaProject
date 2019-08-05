/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorihm
 *  
 *  Purpose:Use Insertion Sort to sort the words in the String array
 *
 *  @author  Jayshri
 *  @version 1.0
 *  @since   29-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorihm;

public class InsertionSort 
{


	public static void main(String[] args)
    {
         String[] stringArray = {"beta", "gamma", "alpha", "epsilon", "delta"};
         
         // test array
         System.out.println("Before sorted array");
         for(String element: stringArray)
              System.out.print(element + " \n");
         System.out.println("\n");

         insertionSort(stringArray);

         System.out.println("After Sorted array");
         for(String element: stringArray)
               System.out.print(element + " \n");
         System.out.println("\n");
    }


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
         }}}
