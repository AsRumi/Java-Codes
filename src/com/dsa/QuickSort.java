package com.dsa;

// What are the things that we need for Quick Sort to work:
// An array, a pivot, two loop variables, a low and a high.
// We create partitions and call the quick sort algorithm recursively.
// Time complexity of this is best case: n log n, worst case still n square.
// n log n because only one for loop and recursive therefore all parts run parallelly.

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high) // Only call the algorithm when the length of the divided array is at least 2.
        {
            // You divide the array in two parts right? Therefore you call the algorithm twice.
            // Starting is always low for the first array, and ending is always high for the second array.
            // But how do you find the high and the low for first and second respectively?
            // For that you need to create a partition and find the pivot value.
            int pivot = partition(arr, low, high);
            // Now that we have the pivot variable, we can pass in the pivot as arguments for recursively calling quickSort.
            quickSort(arr, low, pivot-1); // pivot - 1 because we don't need to include the pivot, pivot stays where it is because it is already sorted.
            quickSort(arr, pivot+1, high); // Again, not including the pivot.
        }
    }
    private static int partition(int[] arr, int low, int high)
    {
        // Assume the first value of the pivot to be the value at high.
        int pivot = arr[high];
        int i = low-1; // i always starts from behind low, careful, not -1 because low can also be 2 or 4 or any number depending on where the partition was created.
        int temp; // Used for swapping purposes.
        // Now we create a loop to run from low to high and check all the values with the pivot.
        for(int j = low; j<high; j++)
        {
            if(arr[j] < pivot)
            {
                i++; // Increment i because this is where we need to put the value of array[j].
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Now after running the for loop, all the elements that were less than the pivot were sent to the starting of the array.
        // But what about the pivot variable, since that was at position 'high', its own position was never changed.
        // Well, at least we can say that all the numbers that were less than the pivot were shifted to the front, right?
        // So that means all the values that weren't sent to the front were either equal to or greater than the pivot.
        // Therefore all we need to do is, swap the pivot with position i+1, since all the elements till position i are less than the pivot.
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; // This is what is now referring to the pivot.
    }
    public static void main(String[] args) {
        int[]arr = {6, 5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1); // Calling the quick sort algorithm using the array, the initial low and the initial high values.
        for(int number: arr)
        {
            System.out.print(number+" ");
        }
    }
}
