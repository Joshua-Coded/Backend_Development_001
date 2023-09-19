import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any number: ");

        int n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("Even: ");
                break;

            default:
                System.out.println("Odd: ");
        }

    }

}