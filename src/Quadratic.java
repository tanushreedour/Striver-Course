import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        // Create a list of coefficients
        List<float[]> coefficients = new ArrayList<>();

        // Create a list of roots
        List<String> roots = new ArrayList<>();

        // Get the coefficients from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of all the coefficients 0 when you want to exit...");
        System.out.println("Enter the coefficients: ");
        while (true) {
            float a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            // Check if the user wants to quit
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // Add the coefficients to the list
            coefficients.add(new float[]{a, b, c});
        }

        // Calculate the discriminants and roots for each equation
        for (float[] coefficient : coefficients) {
            float d = coefficient[1] * coefficient[1] - 4 * coefficient[0] * coefficient[2];
            roots.add(coefficient[0] > 0 ? d > 0 ? "Real" : d < 0 ? "Imaginary" : "Equal" : "Invalid");
        }

        // Print the table
        System.out.println("--------------------------------------------");
        System.out.println("|   a   |   b   |   c   |       Roots      |");
        System.out.println("|-------|-------|-------|------------------|");
        for (int i = 0; i < coefficients.size(); i++) {
            float[] coefficient = coefficients.get(i);
            System.out.printf("|  %4.1f |  %4.1f |  %4.1f |      %-8s   |\n", coefficient[0], coefficient[1], coefficient[2], roots.get(i));
        }
        System.out.println("--------------------------------------------");
    }
}
