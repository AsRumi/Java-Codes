package leetcode;

// https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s)
    {
        String[] word = s.split(" ");

        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++)
        {
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean answer = wordPattern("aabba", "car car cat cat car");
        System.out.println(answer);
    }
}
