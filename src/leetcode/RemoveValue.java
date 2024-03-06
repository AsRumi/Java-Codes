package leetcode;

class RemoveValue {
    
    public static void removeElement(int[] nums, int val)
    {
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        int index = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=val)
            {
                nums[index] = nums[i];
                index++;
            }
        }
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
    }
    
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 5, 6, 2, 7, 8};
        removeElement(array, 2);
    }
}
