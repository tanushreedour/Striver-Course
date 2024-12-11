// Print all the possible combinations of a given string
// Programmed on : 02-03-2024

package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence
{
    public static void main(String[] args) {
        System.out.println(subsequenceAL(new ArrayList<String>(),"", "abcd"));
    }
    static void subsequence(String ans, String s)
    {
        if(s.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        subsequence(ans + s.charAt(0), s.substring(1));
        subsequence(ans, s.substring(1));
    }

    static ArrayList<String> subsequenceAL(ArrayList<String> list, String ans, String s)
    {
        if(s.isEmpty())
        {
            list.add(ans);
            return list;
        }
        subsequenceAL(list, ans + s.charAt(0), s.substring(1));
        subsequenceAL(list, ans, s.substring(1));
        return list;
    }
}
