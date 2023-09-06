import java.util.Scanner;
import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        // write a program that fills an array with n integers entered by
        // the user

        Scanner input = new Scanner(System.in);

        System.out.print("How many Elements? (Max is 20): ");

        int n = input.nextInt();

        while (n >= 20 || n <= 0) {
            System.out.print("Invalid number entered");
            n = input.nextInt();
        }

        // create a new block of arrays

        int[] numbers = new int[n];

        // new method fo filling the arrays
        fillArrayOfPoints(numbers);

        // print the arrays to the screen method
        printArrayOfPoints(numbers);
    }

    public static void fillArrayOfPoints(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    public static void printArrayOfPoints(int[] numbers) {
        System.out.print("The elements of the array are: ");
        System.out.println(Arrays.toString(numbers));
    }

}