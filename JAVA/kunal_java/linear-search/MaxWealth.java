import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 4 },
                { 4, 3, 5, 6 },
                { 6, 8, 5, 3 }
        };

        System.out.println(maximumWealth(accounts));
    }

    static int ans = Integer.MIN_VALUE;

    public static int maximumWealth(int[][] accounts) {
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}