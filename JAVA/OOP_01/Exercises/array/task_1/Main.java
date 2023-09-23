// write a program that fills an array with n integers entered by the user

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many elements? (max is 20)");
        int n = s.nextInt();

        while (n > 20 || n < 0) {
            System.out.println("INVALID number!! try again");
            n = s.nextInt();
        }

        int[] numbers = new int[n];

        // the method for filling the array with numbers
        fillArrayInteger(numbers);
        printArrayOfInteger(numbers);

    }

    // the method
    public static void fillArrayInteger(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    public static void printArrayOfInteger(int[] numbers) {
        System.out.print(" the elements are: ");
        System.out.println(Arrays.toString(numbers));
    }
}