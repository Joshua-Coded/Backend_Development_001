import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write a program which displays the sum of digits of an integer read from the
        // user.
        int n = s.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}