import java.util.Scanner;

public class Calculator {  
    public static void main(String[] args) {
        System.out.print("Enter num1 op num2  (5 * 7): ");

        Scanner s = new Scanner(System.in);

        double num1 = s.nextDouble();
        char op = s.next().charAt(0);
        double num2 = s.nextDouble();

        switch (op) {
            case "+":
                System.out.println( num1 + " " + num2);
                break;
            case "-":
                System.out.println( num1 - " " + num2);
                break;
            case '*':
                System.out.println( num1 * " " + num2);
                break;
            case '/':
                System.out.println( num1 / " " + num2);
                break;
            default:
                System.out.println("unable to understand your input");
                break;
        }
    }
}