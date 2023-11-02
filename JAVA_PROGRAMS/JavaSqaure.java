import java.util.Scanner;

/**
 * @author Joshua Alana
 *         java Program to calculate the Area of Square.
 */

public class JavaSqaure {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a string: ");
            double size = sc.nextDouble();
            double area = size * size;
            System.out.println("the area of the square is " + area);
        }
    }
}