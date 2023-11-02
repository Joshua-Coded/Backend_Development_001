import java.util.Scanner;

public class JavaLagNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, num3;
            System.out.println("Enter first number: ");
            num1 = (int) sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = (int) sc.nextInt();
            System.out.println("Enter third number: ");
            num3 = (int) sc.nextInt();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println("num1 is the largest " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("num2 is the largest " + num2);
            } else {
                System.out.println("num3 is the largest " + num3);
            }
        }
    }
}
