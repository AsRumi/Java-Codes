package aafrein;

import java.util.Scanner;

public class First {

    public static void main(String[] args)
    {

        int number = 0;

        // 8 Primitive data-types
        // byte, int, short, long, float, double, char, boolean
        // String -> multiple chars
        //  ini        condition  updation
        for(int i = 0; i<=5;      i=i+2)
        {
            System.out.println(i);
        }
        
        int i = 0;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        i = 0;
        do 
        {
            System.out.println("I AM ONE CHEEKY BASTARD!");
        } while(i<0);

        int num = 2;
        for(int j = 1; j<=10; j++)
        {
            System.out.printf("%d x %d = %d\n",num, j, num*j); // %d %f %c %s - format specifiers
        }
    }
}
