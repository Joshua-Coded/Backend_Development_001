import java.util.ArrayList;
import java.util.Scanner;

// note that this program show case the inner function of the array list.

public class Menu {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        // run until user enter exit

        while (true) {
            displayMenu();
            // read integer from user
            int choice = input.nextInt();

            if (choice == 1) {
                // CALL ADD METHOD
                System.out.print("Enter an integer");
                integers.add(input.nextInt());
                System.out.println("Integer Added");
            } else if (choice == 2) {
                // CALL REMOVE METHOD
                System.out.print("Enter an integer to remove");
                int elementToRemove = input.nextInt();
                if (integers.contains(elementToRemove)) {
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Integer removed");
                } else {
                    System.out.println("Integer not Found!");
                }

            } else if (choice == 3) {
                System.out.println("Your List: " + integers);
            } else if (choice == 4) {
                System.out.println("Good Bye");
                break;
            }

        }

    }

    // my method for displaying the menus.

    public static void displayMenu() {
        System.out.println();
        System.out.println("***** 1: Add");
        System.out.println("****** 2: Remove");
        System.out.println("****** 3: Display");
        System.out.println("****** 4: Exit");
        System.out.println();
        System.out.println("Your Choice: ");

    }
}