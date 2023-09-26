import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4, 5 },
                { 5, 3, 76, 34, 86 },
                { 1, 2434, 6565, 86 },
                { 0, 6, 3, 8, 5 }
        };
        int target = 0;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    // the method
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    // method for searching the max value in 2d array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;

    }

    // method for searching the min value in 2d array
    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;

    }

}