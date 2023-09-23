// write a program that displays the sum, product, and average of elements in an array.

public class SumAverageProduct {
    public static void main(String[] args) {

        // initialize the variables
        int[] numbers = { 1, -2, 4, 5, -10, 20, 30 };

        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];

        }

        average = (double) sum / numbers.length;

        // printing the results
        System.out.println("Sum= " + sum + ", product= " + product + ", Average= " + average);

    }
}