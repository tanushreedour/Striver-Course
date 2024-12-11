import java.util.Scanner;

public class MagicNumberAmazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans = ans + last * base;
            base = base * 5;
        }
        System.out.println("Magic number of "+ n + " is : " + ans);
    }
}
