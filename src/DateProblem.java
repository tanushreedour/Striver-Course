import java.util.Scanner;

public class DateProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date:");
        String date = sc.next();
        System.out.println("Is this date valid?");
        System.out.println(isValidDate(date));
    }
    public static boolean isValidDate(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (year < 1900 || year > 2100) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }

        return true;
    }
}
