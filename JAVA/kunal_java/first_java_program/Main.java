import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(args[0]);
        System.out.print("thank you for learning java!");

        // taking in data from users
        // using the Scanner class

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number? ");
        int n = s.nextInt();
        System.out.println(n);

    }
}