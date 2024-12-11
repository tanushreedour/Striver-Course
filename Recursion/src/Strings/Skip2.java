package Strings;

public class Skip2
{
    public static void main(String[] args) {
        String str = "abbaacfgaanivn";
        String ans = skip(str);
        System.out.println(ans);
    }
    static String ans = "";
    static String skip(String str)
    {
        if(!str.isEmpty()) {
            if (str.charAt(0) == 'a') {
                ans = ans + "";
                return skip(str.substring(1));
            } else {
                ans = ans + str.charAt(0);
                return skip(str.substring(1));
            }
        }
        return ans;
    }
}
