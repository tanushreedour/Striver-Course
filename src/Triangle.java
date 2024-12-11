import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args) {

// Create a list of coefficients
    List<float[]> side = new ArrayList<>();

     // Create a list of roots
    List<String> triangle = new ArrayList<>();

    // Create a list of expected output
    List<String> exp = new ArrayList<>();

    // Get the coefficients from the user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sides if you want to continue otherwise please enter 0 if you want to exit...");
        while (true) {
            System.out.println("Enter the sides: ");
            float a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            //Check if the user wants to quit
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // Add the coefficients to the list
            side.add(new float[]{a, b, c});

            System.out.println("Enter expected triangle type:");
            String expout;
            expout = sc.next();

            // Add the expected output to the list
            exp.add(expout);
        }

        // Determine the triangle for each array of sides
        for(float[] sides : side) {
            if(((sides[0] + sides[1]) > sides[2]) && ((sides[1] + sides[2]) > sides[0]) && ((sides[0] + sides[2]) > sides[1])) {
                if (sides[0] == 0 || sides[1] == 0 || sides[2] == 0) {
                    triangle.add("Invalid");
                } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                    triangle.add("Equilateral");
                } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                    triangle.add("Isoceles");
                } else {
                    triangle.add("Scalene");
                }
            }
            else {
                triangle.add("Invalid");
            }
        }

        // Print the table
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("|   a   |   b   |   c   |       Expected output      |       Actual output      |       Result      |");
        System.out.println("|-------|-------|-------|----------------------------|--------------------------|-------------------|");
        for (int i = 0; i < side.size(); i++) {
            float[] sides = side.get(i);
            System.out.printf("|  %4.1f |  %4.1f |  %4.1f |        %-11s         |        %-11s       |       %-4s        |\n", sides[0], sides[1], sides[2], exp.get(i), triangle.get(i),( exp.get(i).equals(triangle.get(i))) ? "PASS" : "FAIL");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
}