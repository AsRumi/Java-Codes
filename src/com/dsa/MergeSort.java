package com.dsa;

// When using merge sort, what are the variables that you need?
// You need an array, variables for left, right, and mid values.
// When merging two arrays, you need 3 loop variables, two for the two small arrays and one for the big array that is being created with the merge.

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right)
    {
        if(left<right) //  Only perform this operation if left is smaller than right, i.e., the length of the array is at least 2.
        {
            int mid = (left+right)/2; // Find the median index value of the array.
            mergeSort(arr, left, mid); // You have to make partitions, first one goes from left upto mid.
            mergeSort(arr, mid+1, right); // Second partition goes from mid+1 upto right.
            // You also have to merge them back based on sorted values right?
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int [] arr, int left, int mid, int right)
    {
        // Here we have to create two arrays, called right and left arrays.
        // We first need to get the size of both the arrays:
        int sizeLeft = mid - left + 1; // +1 because mid is the index, not the size.
        int sizeRight = right - mid;
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];
        // Now we need to copy the values from the main array into these arrays:
        for(int x = 0; x<sizeLeft; x++) // Copying the values of left array first.
        {
            leftArray[x] = arr[left+x]; // Because left can be any value, not just 0.
        }
        for(int x = 0; x<sizeRight; x++) // Copying the values of right array next.
        {
            rightArray[x] = arr[mid+1+x]; // Because mid+1 is what the next partition is since mid ends at the last position of the left array.
        }

        // Now that we have both the arrays copied, we need to merge them based on a comparison logic.
        // We need three values, one for left array (i), one for right array (j), one for the main array (k).
        int i = 0; // Will be incremented if we use a value from the leftArray and store it to the main Array.
        int j = 0; // Will be incremented if we use a value from the rightArray and store it to the main Array.
        int k = left; // Starts from the left value because that is where the big array must start from.
        // The loop must run only until i is less than sizeLeft and j is less than sizeRight.
        while(i<sizeLeft && j<sizeRight)
        {
            // Now you have to check if the values present in the left array is smaller or the value present in the right.
            // There are only 2 cases: Either value in the left array will be smaller or value in the right.
            // Third case is if they are equal but we don't really mind, we can swap them either ways.
            if(leftArray[i] < rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++; // You also have to increment index value of the main array once the swap has been made.
        }
        // Now it can be possible that there are some left out values from either one of Right or Left arrays.
        // Because one of the condition from (i<sizeLeft && j<sizeRight) could've been met without giving a chance to the other array to finish copying.
        // Therefore we simply run a while loop for both the arrays just in case they have left over values.
        while (i<sizeLeft) {
            // Simply copy the remaining values:
            arr[k] = leftArray[i];
            i++; // Increment so they reach their last values.
            k++;
        }
        while (j<sizeRight) {
            // Do the same for rightArray:
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 4, 6, 2};
        mergeSort(arr, 0, arr.length-1); // Passing in the initial left and right values along with the array.
        for(int number: arr)
        {
            System.out.print(number+" ");
        }
    }
}
