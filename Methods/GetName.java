import java.util.Scanner;

// write methods that gets name and age from users

public class GetName {
    public static void main(String[] args) {

        System.out.print("Enter name and Age: ");
        System.out.println(getName() + " " + " is " + getAge());

    }

    public static String getName() {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        return name;
    }

    public static double getAge() {
        Scanner num = new Scanner(System.in);
        double s = num.nextDouble();
        return s;
    }
}