package com.tutorials;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        // The while and do-while loop:
        /* boolean flag = true;
        while(flag)
        {
            System.out.println("I am not an infinite while loop...");
            flag = false;
        }
        flag = false;
        do {
            System.out.println("This loop was executed only once...");
        } while (flag); */
        
        // Write a program to print the first n odd numbers:
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            System.out.print((2*i+1)+"\t");
        }
        sc.close(); */

        // For Each Loop: Used to traverse a data structure and access all its elements:
        /* int [] a = {1, 2, 3, 4, 5};
        for(int element:a)
        {
           // You can perform any operation with the element here:
            System.out.println(element);
        }
        
        String [] names = {"Rumi", "Ruru", "Mustu"};
        for(String name: names)
        {
            System.out.println(name);
        } */
        
        // 2-D Arrays:
        /* int [][] flats = new int [2][3]; // An array of 2 rows and 3 columns has been created.
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102; // and so on...
        
        // You can also declare a 2-D array like this:
        int [][] numbers = {{1, 2, 3}, {4, 5, 6}};
        for(int[] numberArray: numbers)
        {
            for(int number: numberArray)
            {
                System.out.println(number);
            }
        } */

        // Write a program to reverse an array:
        /* int [] arr = {1, 2, 3, 4, 5, 6};
        int length = arr.length;
        int n = Math.floorDiv(length, 2); // We are finding the mid point and swapping items around the mid point.
        for(int i = 0; i<n; i++)
        {
            // Swap arr[i] with arr[l-1-i]
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }
        for(int i = 0; i<length; i++)
        {
            System.out.println(arr[i]);
        } */

        // Write a program to check if an array is sorted in ascending order or not:
        /* int []arr = {1, 2, 3, 4, 5, 6};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++) // We go up till length - 1 only because if the array is sorted, the array goes out of bounds.
        {
            if(arr[i]>arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("The array is sorted.");
        }
        else
        {
            System.out.println("The array is unsorted.");
        } */
        
        
    }
}
