import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        System.out.println("Welcome to my if, else and if-else program");

        Scanner num = new Scanner(System.in);

        System.out.print("Enter a  number: ");

        if (num.nextInt() == 10) {
            System.out.print(" Number is equal to 10");
        } else if (num.nextInt() > 10) {
            System.out.print(" Number is greater than 10");
        } else {
            System.out.print(" Number is greater than or equal to 10");
        }
    }
}