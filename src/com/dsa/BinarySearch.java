package com.dsa;

public class BinarySearch {

    public int binarySearch(int[] nums, int target)
    {
        int length = nums.length;
        int first = 0, last = length-1, mid;
        while(first<=last)
        {
            mid = (first+last)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                last = mid-1;
            }
            else
            {
                first = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 50, 60, 200};
        int target = 4;
        BinarySearch obj = new BinarySearch();
        int res = obj.binarySearch(arr, target);
        if(res == -1)
        {
            System.out.println("Element not found!");
        }
        else
        {
            System.out.println("Element found at position "+(res+1));
        }
    }
}
