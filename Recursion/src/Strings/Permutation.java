package Strings;

import java.util.ArrayList;

public class Permutation
{
    public static void main(String[] args) {
        int count = permutation("", "abcd");
        System.out.println(count);
        System.out.println(permutationList("", "abcd"));
    }
    static int permutation(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return 1;
        }
        char ch = up.charAt(0);
        int size = p.length();
        int count = 0;
        for(int i =0 ; i <= size ; i++)
        {
            String first = p.substring(0, i);
            String second = p.substring(i, size);
            count = count + permutation(first + ch + second , up.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutationList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        int size = p.length();

        for(int i =0 ; i <= size ; i++)
        {
            String first = p.substring(0, i);
            String second = p.substring(i, size);

            list.addAll(permutationList(first + ch + second , up.substring(1)));
        }
        return list;
    }
}
