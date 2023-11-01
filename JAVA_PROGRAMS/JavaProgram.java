import java.util.Scanner;

/**
 * @author Joshua Alana
 *         Java program to calculate the area of the Triangle.
 */

public class JavaProgram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ente the width of the triangle:");
            double width = sc.nextDouble();

            System.out.println("Enter the height of the triangle:");
            double height = sc.nextDouble();

            // Area = (width * height) / 2
            double area = (height * width) / 2;
            System.out.println("Area  = " + area);
        }
    }
}