import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Do you want to enter the width and the height? (y/n): ");

            char choice = input.next().charAt(0);

            if (choice == 'y') {
                System.out.print("Enter the width and height of a rectangle: ");
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            }

            else if (choice == 'n') {
                rectangles[i] = new Rectangle();
            }

            else {
                System.out.println("invalid choice");
                rectangles[i] = new Rectangle();
            }
        }

        System.out.println("The rectangles are: ");

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + (i + 1) + ": width: " + rectangles[i].getWidth() + ", height: "
                    + rectangles[i].getHeight());
        }
    }
}