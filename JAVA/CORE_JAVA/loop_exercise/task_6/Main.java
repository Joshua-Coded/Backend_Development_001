
/**
 * write a program which displays the sum of digits of an integer reads from the users
 * 
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("sum: " + sum);
    }
}