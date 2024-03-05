package practice;
// Writing a code to find if a substring exists in a given string.
public class Substring {

    public static String findSubstring(String str, String target)
    {
        
        boolean result = false;
        if(target.length()>str.length())
        {
            return "Target string length is bigger, invalid.";
        }
        if(target.length()==0)
        {
            return "Target too small, invalid.";
        }
        for(int i = 0; i<str.length()-target.length()+1; i++)
        {
            int j = 0;
            while(j<target.length() && str.charAt(i+j) == target.charAt(j))
            {
                j++;
            }
            if(j==target.length())
            {
                result = true;
            }
        }
        if(result)
        {
            return "Found!";
        }
        return "Not Found!";
    }

    public static void findLongestCommonSubstring(String string1, String string2)
    {
        int max = 0, index = 0;
        int [][] table = new int[string1.length()+1][string2.length()+1];
        for(int i = 1; i<string1.length()+1; i++)
        {
            for(int j = 1; j<string2.length()+1; j++)
            {
                if(string1.charAt(i-1) == string2.charAt(j-1))
                {
                    table[i][j] = table[i-1][j-1]+1;
                }
                else
                {
                    table[i][j] = 0;
                }
                if(table[i][j]>max)
                {
                    max = table[i][j];
                    index = i-1;
                }
            }
        }
        System.out.println("The length of the longest common substring is "+max+" and it starts at index "+(index-max+1)+".");
    }

    public static void main(String[] args) {
        // Function call for finding substring:
        // String message = findSubstring("This is a String", "");
        // System.out.println(message);
        
        // Function for finding the length of the longest common substring:
        findLongestCommonSubstring("dddddddabcde", "ebcabcde");
    }
}
