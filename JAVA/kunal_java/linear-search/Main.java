public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 6, 80, -5, 4, -69 };
        int target = 80;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // methods for the linear search

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0 - 1;
        }

        else {
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
        }

        return -1;
    }
}