// wrinte a program which reads a positive number N from the user then indicates if n IS PRIME OR NOT.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive number: ");

        int n = s.nextInt();

        if (n % 2 == 0)
            System.out.println("you entered the right number");
        else
        System.out.println("try again: ");
    }
}