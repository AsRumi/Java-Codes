package leetcode;
// https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Scanner;

public class MergeArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) 
        {
            if (i >= 0 && nums1[i] > nums2[j]) 
            {
                nums1[k--] = nums1[i--];
            } else 
            {
                nums1[k--] = nums2[j--];
            }
        }
        for(int num:nums1)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 2, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
