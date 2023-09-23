import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer");
        int n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("Number is even");
                break;
            default:
                System.out.println("Number is odd");
        }
    }
}