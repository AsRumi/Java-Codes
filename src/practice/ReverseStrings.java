package practice;

import java.util.*;

public class ReverseStrings {

    public static ArrayList<String> reverseStringArray(String[] array)
    {
        ArrayList<String> reverse = new ArrayList<>();
        String rWord = "";
        for(String word: array)
        {
            for(int i = 0; i<word.length(); i++)
            {
                char ch = word.charAt(i);
                rWord = ch+rWord;
            }
            reverse.add(rWord);
            rWord = "";
        }
        return reverse;
    }
    public static void main(String[] args) {
        String[] array = {"HELLO", "HOW", "ARE", "YOU"};
        ArrayList<String> reverseArray = reverseStringArray(array);
        System.out.println(reverseArray);
    }
}
