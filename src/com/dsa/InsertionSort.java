package com.dsa;

public class InsertionSort {

    public static void insertionSort()
    {
        int[]arr = {6, 5, 3, 2, 1, 4};
        int size = arr.length;
        int temp, key;
        for(int i = 1; i<size; i++) // We do not begin from the first index, because we move backwards when comparing the values.
        {
            key = arr[i]; // Keep the value at i currently for comparison, we will shift position based on this value only.
            for(int j = i-1; j>=0; j--) // Start all the way from i-1 and go backwards to 0.
            {
                if(arr[j] > key) // If you find any value that is smaller than current value @ i, that is, the key:
                {
                    temp = arr[j]; // Swap them and again keep going towards 0, but do not change the key.
                    arr[j] = arr[j+1]; // j+1 will be the value in front of j, that is, value at i, that is, the key.
                    arr[j+1] = temp;
                }
            }
        }
        for(int number:arr)
        {
            System.out.print(number+" ");
        }
    }

    public static void main(String[] args) {
        insertionSort();
    }
}
