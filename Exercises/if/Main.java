// write a program that reads an integer from user and determine if the integer is even or odd.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}