package leetcode;

import java.util.Arrays;
import java.util.Stack;

// Functions written here:
// 1. Palindrome (integer)
// 2. Palindrome (string)
// 3. Convert Roman Numeral to Integer.
// 4. Longest common prefix string among an array of strings.
// 5. Parenthesis Checker (implemented using a Stack)

public class SecondAttempt {
    public static void palindromeNumber(int number)
    {
        int copy = number, result = 0, remainder;
        while(copy>0)
        {
            remainder = copy%10;
            result = (result*10)+remainder;
            copy = copy/10;
        }
        if(result == number)
        {
            System.out.println("The number you have entered is a palindrome.");
        }
        else
        {
            System.out.println("The number you have entered is not a palindrome.");
        }
    }

    public static void palindromeString(String str)
    {
        int len = str.length();
        boolean isPalindrome = true;
        for(int i = 0; i < len / 2; i++) 
        {
            if (str.charAt(i) != str.charAt(len - i - 1)) 
                {
                    isPalindrome = false;
                    break;
                }
        }
        if(isPalindrome)
        {
            System.out.println("Given string is a palindrome!");
        }
        else
        {
            System.out.println("Given string is not a palindrome.");
        }
    }

    public static void romanToInteger()
    {
        String roman = "IV";
        int ans = 0, num = 0, prev = 0;
        for(int i = roman.length()-1; i>=0; i--)
        {
            switch (roman.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if(num>=prev)
            {
                ans += num;
            }
            else
            {
                ans -= num;
            }
            prev = num;
        }
        System.out.println(ans);
    }

    public static void longestPrefix()
    {
        StringBuilder prefix = new StringBuilder(); // Creating a StringBuilder object.
        String[] strs = {"flower", "flow", "flight"};
        Arrays.sort(strs); // Sorting the arrays in a lexicographical manner so that all we have to compare is the first and last element.
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i = 0; i<Math.min(first.length(), last.length()); i++) // Iterating only up to the length of the smaller string.
        {
            if(first.charAt(i) != last.charAt(i))
            {
                continue;
            }
            prefix.append(first.charAt(i));
        }
        System.out.println(prefix.toString());
    }

    public static void parenthesisChecker()
    {
        Stack<Character> stack = new Stack<Character>();
        String brackets = "((){}[])";
        char[] bracket = brackets.toCharArray();
        boolean answer = true;
        for(char bra: bracket)
        {
            if(bra == '(')
            {
                stack.push(')');
            }
            else if(bra == '{')
            {
                stack.push('}');
            }
            else if(bra == '[')
            {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != bra)
            {
                answer = false;
            }
        }
        if(!stack.isEmpty())
        {
            answer = false;
        }
        if(answer)
        {
            System.out.println("Correct brackets!");
        }
        else
        {
            System.out.println("Wrong brackets...");
        }
    }

    public static void main(String[] args) {
        
        // palindromeNumber(122531);
        // palindromeString("ABAB");
        // romanToInteger();
        // longestPrefix();
        // parenthesisChecker();
    }   
}
