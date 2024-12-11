import java.lang.String;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "abcabcbcaabc";
        System.out.println("Frequency of 'a' is: " + FindCount('a', s));
    }
    static int FindCount(char c, String s)
    {
        int[] hash = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        {
            hash[s.charAt(i) - 'a'] += 1;
        }
        return hash[c - 'a'];
    }
}
