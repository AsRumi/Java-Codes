package com.dsa;

public class SelectionSort {

    public static void selectionSortDescending()
    {
        int[]arr = {1, 2, 3, 7, 4, 5, 6};
        int temp, maxIndex;
        int size = arr.length;
        System.out.println("Array before sorting in descending order: ");
        for(int number:arr)
        {
            System.out.printf(number+" ");
        }
        System.out.println();
        
        for(int i = size-1; i>0; i--) // You do not need to check for the last item, since it will be sorted.
        {
            maxIndex = i;
            for(int j = i; j>=0; j--) // You need to go till the last item since you need to check the entire array.
            {
                if(arr[j] < arr[maxIndex])
                {
                    maxIndex = j;
                }
            }
            temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array after sorting: ");
        for(int number: arr)
        {
            System.out.print(number+" ");
        }

    }

    public static void selectionSortAscending()
    {
        int nums[] = {12, 5, 4, 30, 51, 1};
        int length = nums.length;
        int temp, minIndex;
        System.out.println("Array before sorting in ascending order: ");
        for(int number: nums)
        {
            System.out.print(number+" ");
        }
        System.out.println();

        for(int i = 0; i<length-1; i++)
        {
            minIndex = i;
            for(int j = i+1; j<length; j++)
            {
                if(nums[j]<nums[minIndex])
                {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println("Array after sorting: ");
        for(int number: nums)
        {
            System.out.print(number+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // You can call any function:
        selectionSortDescending();
        // selectionSortAscending();
    }
}