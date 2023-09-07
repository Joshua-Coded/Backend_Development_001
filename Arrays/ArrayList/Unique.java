import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.print("Enter 6 integers::");

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            int nums = s.nextInt();

            if (!integers.contains(nums)) {
                integers.add(nums);
            }
        }

        Collections.sort(integers);
        System.out.println("Your Unique integers are: " + integers);
    }
}