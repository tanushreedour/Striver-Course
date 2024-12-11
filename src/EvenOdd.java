import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        if((n & 1) == 0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
