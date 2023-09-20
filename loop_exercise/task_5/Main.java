
/**
 * write a program which reads a sequence of positive integers.
 * the program stops when the user fills a negative value and shows the maximum
 * and minimum of these numbers.
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int max = n;
        int min = n;

        if (n >= 0) {
            while (true) {
                n = s.nextInt();

                if (n < 0)
                    break;

                max = n > max ? n : max;
                min = n < min ? min : min;
            }

            System.out.println("min: " + min + " max: " + max);

        } else {
            System.out.println(n + "is invalid");
        }
    }
}