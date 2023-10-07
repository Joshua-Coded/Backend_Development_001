import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * syntax of for loop
         * if (initialization; conditional; increment) {
         * body
         * }
         */

        // print numbers 1 - 5

        // for (int i = 1; i <= 5; i++) {
        // System.out.println(i);
        // }

        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            System.out.println("Hello world!!");
        }
    }
}