
// write  a program that reads an integer between 1 and 10 from user.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number between 1 and 10");

        int n = s.nextInt();

        while (n < 1 || n > 10) {
            System.out.print(n + " is not between 1 and 10: try again");

            n = s.nextInt();
        }

        System.out.println(n + " is between 1 and 10");

    }
}