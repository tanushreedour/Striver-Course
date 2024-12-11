public class Zeroes {
    public static void main(String[] args) {
        int n = 10000;
        int c = 0;
        System.out.println(zeroCount(n, c));
    }
    static int zeroCount(int n, int c)
    {
        if(n == 0 && c == 0)
        {
            return 1;
        }
        if(n > 0){
            if(n % 10 == 0){
                return zeroCount(n/10, c + 1);
            }
            else {
                return zeroCount(n/10, c);
            }
        }
        return c;
    }
}

