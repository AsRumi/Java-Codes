package practice;

public class FrequencyCount {

    public static int frequencyCountChar(String str, char target)
    {
        if(str.length() == 0)
        {
            return -1;
        }
        int count = 0;
        for(char character: str.toCharArray())
        {
            if(character == target)
                count++;
        }
        return count;
    }

    public static int frequencyCountName(String[] names, String target)
    {
        // You can solve it by comparing the characters one by one, but your time complexity scales.
        // If you simply use .equals() you can save an extra for loop.
        int count = 0;
        for(String name:names)
        {
            if(areEqual(name, target)) // We wrote another function to check character wise if the two strings are equal.
            {
                count++;
            }
        }
        return count;
    }

    public static boolean areEqual(String name, String target)
    {
        if(name.length() != target.length())
        {
            return false;
        }
        for(int i = 0; i<name.length(); i++)
        {
            if(name.charAt(i) != target.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Function to check the number of times a character occurs in a string.
        // int answer = frequencyCountChar("aaaa", 'b');
        // System.out.println(answer);

        // Function to check the number of times a name appears in an array of strings.
        // We have written two functions to solve this problem.
        String[] names = {"Rumi", "Rumi", "Ruru"};
        int answer = frequencyCountName(names, "Ruru");
        System.out.println(answer);
    }
}
