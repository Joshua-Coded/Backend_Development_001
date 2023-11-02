import java.util.Scanner;

public class JavaRect {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of rectangle");
            double lenght = sc.nextDouble();
            System.out.println("Enter the width of the rectangle");
            double width = sc.nextDouble();
            double area = lenght * width;
            System.out.println("the area of the rectangle: " + area);
        }
    }
}