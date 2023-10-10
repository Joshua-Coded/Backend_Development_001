import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print("the sum of the two numbers is:" + sum);
    }
}