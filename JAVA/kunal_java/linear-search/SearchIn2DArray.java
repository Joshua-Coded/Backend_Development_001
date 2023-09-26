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

}