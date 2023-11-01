
import java.util.Scanner;

/**
 * @author Joshua Alana
 *         Java program that add two numbers
 */

public class JavaProgramAddTwoNumber {
    public static void main(String[] args) {
        int num1, num2, sum;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            num2 = sc.nextInt();

            sum = num1 + num2;
            System.out.println("the sum is: " + sum);
        }
    }
}