import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name and age: ");

        String name = input.nextLine();
        double age = input.nextDouble();

        System.out.println(" Your name is: " + name + " and you are" + " " + age + " old! ");

    }
}