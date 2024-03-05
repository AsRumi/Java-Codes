package com.tutorials;

public class Recursion {

    // A function in Java can call itself.
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1); // A function calling itself again and again is called a recursive function.
        }
    }

    // This is a method that we have created to print the series of a fibonacci number:
    static int[] fibo(int n)
    {
        int[]arr = new int[n];
        arr[0] = 0;
        int first = 1;
        if(n==1)
        {
            return arr;
        }
        for(int i = 1; i<n; i++)
        {
            if(first == 1)
            {
                arr[1] = arr[0]+1;
                first++;
                continue;
            }
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }
    
    // However we can also use recursion to return the nth term of the fibonacci series:
    static int fiboN(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return fiboN(n-1)+fiboN(n-2);
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
        int[]resultFibo = fibo(10);
        for(int i = 0; i<resultFibo.length; i++)
        {
            System.out.print(resultFibo[i]+" ");
        }
        int resultN = fiboN(7); // This will get us the 7th term in the fibonacci series:
        System.out.println("\n"+resultN);
    }
}
