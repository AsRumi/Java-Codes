package leetcode;

// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
// Ideated in 2 minutes, 59 seconds.

import java.util.Stack;

public class MajorityElement {
    public static void main(String[] args) {
        Stack<Integer> sack = new Stack<>();
        int[] nums = {2,2,1,1,1,2,2};
        sack.push(nums[0]);
        int top = 0;
        System.out.println(sack);
        for(int i = 1; i<nums.length; i++)
        {
            if(sack.isEmpty())
            {
                sack.push(nums[i]);
                continue;
            }
            int element = sack.peek();
            if(element != nums[i])
            {
                sack.pop();
            }
            else
            {
                sack.push(nums[i]);
            }
        }
        int result = sack.peek();
        System.out.println(result);
    }
}
