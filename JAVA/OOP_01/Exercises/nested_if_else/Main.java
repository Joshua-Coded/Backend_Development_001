import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 10: ");

        int n = s.nextInt();

        if (n > 10) {
            System.out.println("YOu got the game! far greater than 10");
        }

        else if (n == 10) {
            System.out.println("that was excactly 10");
        }

        else {
            System.out.println("Sorry try again");
        }
    }
}