// A four digit number ABCD is callled lucky if A + B = C + D.

// write a program that asks the user to enter a four digit number and tell if the number is a lucky or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a four digit number: ");

        int n = s.nextInt();

        if (!(n > 999 && n < 10000)) {
            System.out.println(n + " is not a valid number");
        }

        else {
            // ABCD

            int fourDigits = n % 10; // to get the last digit D
            int thirdDigits = (n / 10) % 10; // to get the third digit C
            int secondDigits = (n / 100) % 10; // to get the second digit B
            int firstDigits = (n / 1000) % 10; // to get the first digit A

            if (firstDigits + secondDigits == thirdDigits + fourDigits) {
                System.out.println("Lucky number");
            } else {
                System.out.println("not lucky today, try again");
            }
        }
    }
}
