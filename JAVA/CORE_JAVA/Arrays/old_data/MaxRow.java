// write a program that prints the maximum number of each row in a 2d array.

public class MaxRow {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 3, 4, 10 },
                { 11, -3, 9, 4 },
                { 12, 5, 6, 7, }
        };

        for (int i = 0; i < 3; i++)
            System.out.println("Max row: " + (i + 1) + ": " + getMax(numbers[i]));

    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            max = (max < numbers[i]) ? numbers[i] : max;

        }
        return max;
    }
}