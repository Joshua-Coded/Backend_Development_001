import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("We want to check for the number that is odd or even.");

        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = inputs.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        }

        if (num % 2 == 1) {
            System.out.print("The number is Odd");
        }

    }
}