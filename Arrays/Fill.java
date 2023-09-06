import java.util.Scanner;
import java.util.Arrays;
import java.awt.Point;

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

        Point[] points = new Point[n];

        // new method fo filling the arrays
        fillArrayOfPoints(points);

        // print the arrays to the screen method
        printArrayOfPoints(points);
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.print("The elements of the array are: ");
        System.out.println(Arrays.toString(points));
    }

}