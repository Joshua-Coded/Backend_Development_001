import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.print("Enter an integer: ");
            sum += s.nextInt();

        } while (sum <= 100);

        System.out.println("Done: " + sum);
    }
}