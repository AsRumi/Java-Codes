package com.tutorials;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Incrementing a character variable.
        char a = 'a';
        System.out.println(++a);
        // What will be the value of this expression?
        float ans = 7/4*9/2;
        System.out.println(ans); // The answer is not 7.875 because the expression was calculated using integers then assigned to a float variable later, therefore the answer to that expression is 4.
        // However, if you want the answer you were looking for, use the following method:
        float ans2 = 7/4.0f*9/2.0f;
        System.out.println(ans2);
        // Strings are immutable and cannot be changed.
        String name = "Rumi";
        String otherName = "Ruru";
        String bothNames = name+otherName;
        System.out.println(bothNames);
        // Substring:
        String string1 = "This is a string";
        String substring1 = string1.substring(8, 9); // Start string1 from 8th index.
        String firstLetter = string1.substring(0, 1);
        System.out.println(firstLetter);
        System.out.println(substring1);
        // Replacing a character with another in a string:
        String string2 = "Guppy";
        String replacedString2 = string2.replace('G', 'P'); // This is case sensitive.
        System.out.println(replacedString2);
        // Getting the first character of a String (or a character at any position for that case):
        String string3 = "Sunny";
        char firstString3 = string3.charAt(0);
        System.out.println(firstString3);
        // Getting the index of a substring, returns -1 if index of that string is not found:
        String string4 = "This is a Java recap for Rumi";
        int indexOfString4 = string4.indexOf("Java");
        System.out.println(indexOfString4); // Returns 10, which is the index from which the substring starts. If the sequence is not found, then -1 is returned.
        String randomString = "Mary had a little lamb";
        int indexOfLittle = randomString.indexOf("little");
        if(indexOfLittle == -1)
        {
            System.out.println("Little does not occur in the given string.");
        }
        else
        {
            System.out.format("Little occurs at position %d to position %d", indexOfLittle+1, indexOfLittle+6);
        }
        // How do you check strings for equality? Using the .equals() function:
        String string5 = "Some String";
        String string6 = "some string";
        String string7 = "Some Other String";
        String string8 = "Some String";
        System.out.println();
        System.out.println(string5.equals(string8));
        System.out.println(string5.equals(string7));
        System.out.println(string5.equalsIgnoreCase(string6));

        // Practice question 1:
        // String letterTemplate = "Dear <name>, thanks a lot!";
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter your full name: ");
        // String userName = sc.nextLine();
        // String message = letterTemplate.replace("<name>", userName);
        // System.out.println(message);
        // sc.close();

        
    }
}
