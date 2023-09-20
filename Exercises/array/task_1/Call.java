
// do the same task using the pointer class
import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;

public class Call {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n > 20 || n <= 0) {
            System.out.println("INvalid number:: try again");
            n = s.nextInt();
        }

        // CREATE ARRAY USING THE POINTER CLASS....
        Point[] points = new Point[n];
        // use the methods to use the pointer..

        fillArrayOfPointers(points);
        printArrayOfPoints(points);
    }

    public static void printArrayOfPoints(Point[] points) {
        System.out.print("the elements of the array are: ");
        // System.out.println(Arrays.toString(points));
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
    }

    public static void fillArrayOfPointers(Point[] points) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            System.out.print("enter x and y coordinates" + (i + 1) + " ");
            points[i] = new Point(s.nextInt(), s.nextInt());
        }
    }
}