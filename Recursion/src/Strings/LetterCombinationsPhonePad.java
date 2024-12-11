package Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhonePad
{
    public static void main(String[] args) {
        List<String> ans = Google("", "");
        System.out.println(ans);
    }
    static void PhonePad(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';    // This will convert '1' to 1
        for(int i = (digit - 1) * 3 ; i < digit * 3 ; i++)
        {
            char ch = (char) ('a' + i);
            PhonePad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> list = new ArrayList<String>();
    // static String process = "";
    static List<String> Google(String p, String up)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        int num = up.charAt(0) - '0';    // This will convert '1' to 1
        int digit = num - 1;
        if(num < 7) {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                Google(p + ch, up.substring(1));
            }
        }
        if(num == 7)
        {
            for (int i = 15; i < 19; i++) {
                char ch = (char) ('a' + i);
                Google(p + ch, up.substring(1));
            }
        }
        if(num == 8)
        {
            for (int i = 19; i < 22; i++) {
                char ch = (char) ('a' + i);
                Google(p + ch, up.substring(1));
            }
        }
        if(num == 9)
        {
            for (int i = 22; i < 26; i++) {
                char ch = (char) ('a' + i);
                Google(p + ch, up.substring(1));
            }
        }
        return list;
    }
}
