public class ReverseNumber
{
    public static void main(String[] args) {
        int n = 145441;
        System.out.println("reverse of 1438 : " + Rev(n));
        System.out.println("Pallindrome : " + Pallindrome(n));
    }
    public static int Rev(int n){
        if(n % 10 == n){
            return n;
        }
        int digits = (int)(Math.log10(n)+1);
        int base = digits -1;
        return (int)(((n % 10) * Math.pow(10, base)) + Rev(n/10));
    }

    static boolean Pallindrome(int n){
        if(Rev(n) == n)
        {
            return true;
        }
        return false;
    }
//    static int c = 0;
//     public static int count(int n) {
//        if(n % 10 == n){
//            return ++c;
//        }
//        n = n / 10;
//        c = c + 1;
//        return count(n);
//    }
}
