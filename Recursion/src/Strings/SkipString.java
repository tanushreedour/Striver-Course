package Strings;

public class SkipString
{
    public static void main(String[] args) {
        System.out.println(skipString("bbc" , "abbchfgbbcaa", ""));
    }
    static String skipString(String skip, String str, String ans)
    {
        if(!str.isEmpty())
        {
            if(str.startsWith(skip))
            {
                return skipString(skip, str.substring(skip.length()), ans);
            }
            else {
                return skipString(skip, str.substring(1), ans + str.charAt(0));
            }
        }
        return ans;
    }
}
