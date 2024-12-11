public class StringCheck {
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(minAddToMakeValid(s));
    }
        static int openCount = 0;
        static int closeCount = 0;
        static int minAddToMakeValid(String s) {
            for(int i=0 ; i < s.length() ; i++)
            {
                if((s.charAt(i)) == '(')
                {
                    openCount = openCount + 1;
                }
                else{
                    closeCount = closeCount + 1;
                }
            }
            if(openCount > closeCount || openCount < closeCount)
            {
                return Math.abs(openCount - closeCount);
            }
            return 0;
        }
}
