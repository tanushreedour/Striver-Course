package Strings;

public class Skip
{
    public static void main(String[] args) {
        String str = "abbcchgbaaan";
        skip("", str);
    }
    static void skip(String ans, String str)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        if(str.charAt(0) == 'a')
        {
            skip(ans, str.substring(1));
        }
        else
        {
            skip(ans + str.charAt(0), str.substring(1));
        }
    }
}
