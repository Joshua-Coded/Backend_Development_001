
// write a method that gets the name of the users and the age of the user..

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter  your name and age: ");
        System.out.println(getName() + " " + getAge());
    }

    // the get name methods
    public static String getName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }

    // get age methods
    public static int getAge() {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        return age;
    }
}