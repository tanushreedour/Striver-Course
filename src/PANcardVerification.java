import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/*
public class PANcardVerification
{
    public static void main(String[] args) {
        String str = "ABCDE1234E";
        System.out.println(isValidPanCardNumber(str));
    }
    static boolean isValidPanCardNumber(String str){
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern p = Pattern.compile(regex);
        if(str == null)
        {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
 */
public class PANcardVerification
{
    public static void main(String[] args) {
        List<String> PAN = new ArrayList<>();
        List<String> exp = new ArrayList<>();
        List<String> actual = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter PAN card number : ");
            String str = sc.next();
            if(str.equals("000"))
            {
                break;
            }
            PAN.add(str);

            System.out.println("Enter expected validity:");
            String expout;
            expout = sc.next();

            // Add the expected output to the list
            exp.add(expout);

            String ans = String.valueOf(isValidPanCardNumber(str));
            actual.add(ans);
        }
        // Print the table
        System.out.println("------------------------------------------------------------------");
        System.out.println("|          PAN        | Expected output | Actual output | Result |");
        System.out.println("|---------------------|-----------------|---------------|--------|");
        for (int i = 0; i < PAN.size(); i++) {
            System.out.printf("|    %13s    |       %-5s     |     %-5s     |  %-4s  |\n",PAN.get(i), exp.get(i), actual.get(i), (exp.get(i).equals(actual.get(i))) ? "PASS" : "FAIL");
        }
        System.out.println("------------------------------------------------------------------");
    }
    static boolean isValidPanCardNumber(String str){
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern p = Pattern.compile(regex);
        if(str == null)
        {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }
}