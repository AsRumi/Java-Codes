package leetcode;

import java.util.Scanner;

public class FirstAttempt {
    
    public void merge(int[] num1, int m, int[] num2, int n)
    {
        int[] arr1 = new int[m+n];
        for(int i = 0; i<m; i++)
        {
            int pointer = i;
            arr1[pointer] = num1[i];
            for(int j = 0; j<n; j++)
            {
                if(num2[j]<=num1[i])
                {
                    arr1[pointer+1] = num2[j];
                }
            }
        }
        for(int i = 0; i<m+n; i++)
        {
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] args) {
        
        FirstAttempt fa = new FirstAttempt();
        int []a = {1, 2, 3, 0, 0, 0};
        int la = 3;
        int []b = {2,3,5};
        int lb = 3;
        fa.merge(a, la, b, lb);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements in the first array: ");
        // int firstElements = sc.nextInt();
        // System.out.println("Enter the number of elements in the second array: ");
        // int secondElements = sc.nextInt();
        // firstElements = firstElements+secondElements;
        // int[] arr1 =  new int[firstElements];
        // int[] arr2 = new int[secondElements];
        // for(int i = 0; i<firstElements-secondElements; i++)
        // {
        //     System.out.printf("Enter element number %d: ", i+1);
        //     int element = sc.nextInt();
        //     arr1[i] = element;
        // }
        // for(int i = 0; i<secondElements; i++)
        // {
        //     System.out.printf("Enter element number %d: ", i+1);
        //     int element = sc.nextInt();
        //     arr2[i] = element;
        // }
        // fa.merge(arr1, firstElements, arr2, secondElements);
        // sc.close();
    }
}
