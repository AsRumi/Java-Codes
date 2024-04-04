package leetcode;

// You are given an array of sorted integers, you need to delete the integers that repeat and keep a clean array in the front.
// Example: Input: [1, 1, 2, 3, 4, 4, 5, 6]
// Output: [1, 2, 3, 4, 5, 6, _, _] Underscores mean it does not matter what comes in the place of that array.

public class DeleteDuplicate {
    
    public static int removeDuplicates(int[] nums)
    {
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        int i = 0;
        for(int j = 1; j<nums.length; j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        return i+1;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 4, 5};
        int k = removeDuplicates(array);
    }
}
