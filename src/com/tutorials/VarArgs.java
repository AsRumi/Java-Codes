package com.tutorials;

public class VarArgs {

    static int sum(int ...values) // This now takes any number of integer values during function call and stores them in a single array.
    {
        // If you pass in nothing when calling the function, that also works, your array will be initialized to a zero.
        // You can check the list of items using the following code:
        /* 
        for(int element: values)
        {
            System.out.println(element);
        }
        */
        
        // But for now, let us return the sum of all values coming in:
        int sum = 0;
        for(int element:values)
        {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int first_sum = sum(2, 3, 4, 5);
        System.out.println("The sum of all the numbers is: "+first_sum);
    }
}
