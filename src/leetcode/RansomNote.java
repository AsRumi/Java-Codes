package leetcode;

// https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        ArrayList<Character> ransom = new ArrayList<>();
        for(char character: ransomNote.toCharArray())
        {
            ransom.add(character);
        }
        for(int i = 0; i<magazine.length(); i++)
        {
            for(int j = 0; j<ransom.size(); j++)
            {
                if(magazine.charAt(i) == ransom.get(j))
                {
                    ransom.remove(j);
                    break;
                }
            }
        }
        if(ransom.size()==0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        // ArrayList<Character> ransom = new ArrayList<>();
        // ransom.add('a');
        // ransom.add('b');
        // ransom.add('c');
        // ransom.add('d');
        // ransom.remove(0);
        // char character = ransom.get(0);
        // System.out.println(character+" "+ransom);
        boolean ans = canConstruct("aa", "ab");
        System.out.println(ans);
    }
}
