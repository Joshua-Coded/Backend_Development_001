
// write a program which reads a sequence of integers from the user ans stops by 
// displaying " Done " when the sum of these values exceeds 100.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            sum += s.nextInt();

        } while (sum <= 100)
 
        System.out.println("Number exceeded 100!!" + sum);

    }
}