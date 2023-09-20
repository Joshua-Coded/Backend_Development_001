
// write a program which displays the sum of the strict divisor of an interger given by the user..
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
                // System.out.println(i);
        }

        System.out.println(sum + n);
        }
}