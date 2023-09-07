// write a program that prints the maximum number of each row in a 2d array.

public class MaxRow {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 3, 4, 10 },
                { 11, -3, 9, 4 },
                { 12, 5, 6, 7, }
        };

        for (int i = 0; i < 3; i++) {
            int max = numbers[i][0];

            for (int j = 1; j < 4; j++) {
                max = (numbers[i][j] > max) ? numbers[i][j] : max;

            }

            System.out.println("Max row: " + (i + 1) + ": " + max);

        }
    }
}