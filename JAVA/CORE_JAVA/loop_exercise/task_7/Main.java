
/**
 * write a program that reads an integer n and displays the nth fibonacci value
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int result = 0;
        int v1 = 1;
        int v2 = 1;

        for (int i = 1; i < n - 2; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        System.out.println("result: " + result);

    }
}