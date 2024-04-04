package leetcode;

public class LastWord {

    public static int lengthOfLastWord(String s)
    {
        s = s.trim();
        int length = 0;
        for(int i = s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) == ' ')
            {
                break;
            }
            else
            {
                length++;
            }
        }
        return length;    
    }

    public static void main(String[] args) {
        String s = "HELLO WORLD";
        int answer = lengthOfLastWord(s);
        System.out.println(answer);
    }
}
