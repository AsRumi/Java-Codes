package huzaifa;

import java.util.Scanner;

public class HelloWorld {

    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        Scanner sc = new Scanner(System.in);
        int c = hw.add(1, 5);
        System.out.println("1 + 5 = " + c);
        System.out.println("Enter an year to check if it is a leap year or not.");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
            } else
                System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
        System.out.println("Nice code!");
    }
}
