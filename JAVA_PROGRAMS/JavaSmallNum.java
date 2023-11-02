import java.util.Scanner;

public class JavaSmallNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, num3, temp;
            System.out.println("enter first number");
            num1 = (int) sc.nextInt();
            System.out.println("enter second number");
            num2 = (int) sc.nextInt();
            System.out.println("enter third number");
            num3 = (int) sc.nextInt();

            temp = num1 < num2 ? num1 : num2;
            int result = num3 < temp ? num3 : temp;
            System.out.println("the smallest number is: " + result);
        }
    }
}