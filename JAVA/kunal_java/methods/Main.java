import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: take 2 input of 2 mnumbers and print the sum

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum: " + sum);
    }
}