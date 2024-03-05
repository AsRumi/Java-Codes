package practice;

public class Subsequence {

    public static int longestSubsequence(String s1, String s2)
    {
         // Create a 2D table and initialize with 0s. Leave an extra row and column for the initial row/column.
        int [][] table = new int[s1.length()+1][s2.length()+1];
        // Write two for loops to iterate over the entire table.
        for(int i = 0; i<s1.length()+1; i++)
        {
            for(int j = 0; j<s2.length()+1; j++)
            {
                if(i==0 || j==0) // If you are at the initial row or column, skip.
                {
                    continue;
                }
                // If you find a match, increment the value of the previous diagonal position to 1.
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    table[i][j] = table[i-1][j-1]+1;
                }
                // Otherwise take the maximum value on either the cell before or the cell above.
                else
                {
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        return table[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        int answer = longestSubsequence("abcdehoxxxxod", "acehood");
        System.out.println(answer);
    }
}
