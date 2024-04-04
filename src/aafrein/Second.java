package aafrein;

import java.util.Scanner;

class Aafrein
{
    String name;
    String boyfName;
    int age;
    String degree;
    public void aceExams()
    {
        System.out.println(name+" aced her exams.");
    }
}

public class Second {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lucky number:");
        int luckyNumber = sc.nextInt();
        System.out.println("Your lucky number is "+luckyNumber);
        sc.close();
    }
}
