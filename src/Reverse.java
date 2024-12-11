import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1534236469;
        System.out.println(ReverseNumber(n));
    }
    public static int ReverseNumber(int n)
    {
        int rev = 0;
        int x = 0;

        boolean change = false;

        if(n > Integer.MAX_VALUE)
        {
            return 0;
        }

        if(n < 0){
            change = true;
            n = n * (-1);
        }

        while(n > 0){
            x = n % 10;
            if(rev > (Integer.MAX_VALUE - x) / 10){
                return 0;
            }
            rev = rev * 10 + x;
            n = n /10;
        }

        if(change ==  true)
        {
            rev = rev * (-1);
        }

        return rev;
    }
}
