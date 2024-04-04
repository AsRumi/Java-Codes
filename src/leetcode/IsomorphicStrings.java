package leetcode;

// https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t)
    {
        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i; j<t.length(); j++)
            {
                if(s.charAt(j) == s.charAt(i) || t.charAt(j) == t.charAt(i))
                {
                    if((t.charAt(j) != t.charAt(i)) || (s.charAt(j) != s.charAt(i)))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = isIsomorphic("badc", "baba");
        System.out.println(ans);
    }
}