package com.dsa;

public class BubbleSort {

    int[] bubbleSort(int[] arr)
    {
        int l = arr.length; // Storing the length in a convenient variable.
        int temp; // To swap the values.
        for(int i = 0; i<l; i++)
        {
            for(int j = 0; j<l-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        BubbleSort obj = new BubbleSort();

        int [] nums = {6, 5, 2, 1, 8, 4, 9, 11, 0, -3, 4, 5, 56, 42, 31};
        System.out.println("Values before sorting:");
        for(int num: nums)
        {
            System.out.print(num+" ");
        }

        int[] sortedNums = obj.bubbleSort(nums);

        System.out.println("\nValues after sorting:");
        for(int num:sortedNums)
        {
            System.out.print(num+" ");
        }
    }
}
