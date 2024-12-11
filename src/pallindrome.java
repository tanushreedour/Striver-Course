import java.awt.*;
import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
//        String temp=s;
//        char[] arr = temp.toCharArray();
//        String reverse="";
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            reverse = reverse + arr[i];
//        }
//        if(reverse.equals(s))
//        {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
    }
        static boolean isPalindrome(int x) {
//            String str = Integer.toString(x);
//            String temp = str;
//            char[] arr = temp.toCharArray();
//            String reverse="";
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            reverse = reverse + arr[i];
//        }
//        if(reverse.equals(str))
//        {
//            return true;
//        }
//        return false;

            int temp = x;
            if(x<0)
            {
                return false;
            }
            int rev=0;
            while(x>0)
            {
                int n =x%10;
                rev = rev*10 + n;
                x=x/10;
            }
            return temp==rev;
        }
}
