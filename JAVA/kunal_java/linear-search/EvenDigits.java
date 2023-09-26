public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 2, 22, 56, 345, 7896 };
        System.out.println(findNumbers(nums));
    }

    // the method for findNumbers
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num))
                count++;
        }
        return count;
    }

    // the even for methods

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // the digits method
    static int digits(int num) {
        if (num < 0)
            num = num * -1;
        return (int) (Math.log10(num)) + 1;
    }
}