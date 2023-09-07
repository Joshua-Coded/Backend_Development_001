// write a program that prints the sum of each row in a 2d array....

public class SumRow {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3, 4 },
                { 3, 4, 5, 6 },
                { 5, 6, 7, 8 }
        };

        // for (int i = 0; i < numbers.length; i++) {

        // int sum = 0;

        // for (int j = 0; j < numbers[i].length; j++) {
        // sum += numbers[i][j];
        // }

        // System.out.println("the sum of the row: " + (i + 1) + " is:" + sum);
        // }

        // -ps the above code prints the sum of the row.

        // this code print the sum of the column

        for (int i = 0; i < 4; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += numbers[j][i];

            }

            System.out.println("The sum of the column: " + (i + 1) + " is : " + sum);

        }

    }
}