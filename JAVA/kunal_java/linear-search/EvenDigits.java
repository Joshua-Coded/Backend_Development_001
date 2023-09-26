public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    // this is a leetcode question
    // the method for answer.

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // the even fucntion
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // count the number of digits in a number
    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}