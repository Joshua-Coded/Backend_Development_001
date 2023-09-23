// write a program that reads a positive integer from the user and displays the following message
// 1
// 22
// 333
// 4444
// NNNNN.NNNN

import java.util.Scanner;

public class Na {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}