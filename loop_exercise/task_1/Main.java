// write a program that print the  even numbers between 1 and 100 in an increasing order.

public class Main {
    public static void main(String[] args) {
        // we will use for loop

        // in an increasing order
        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i + " ");
        // }
        // }

        // in a decreasing order

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}