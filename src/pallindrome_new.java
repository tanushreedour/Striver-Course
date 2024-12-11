import java.util.Locale;
import java.util.Scanner;

public class pallindrome_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The given string is Pallindrome? --> " + isPallindrome(s));
    }
    static boolean isPallindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start = start + 1;
                end = end - 1;
            } else {
                return false;
            }
        }
        return true;
    }
//        System.out.println(5/2);
}
