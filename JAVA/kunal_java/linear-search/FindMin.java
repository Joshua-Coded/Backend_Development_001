public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 2, 23, 434, 6, -1, 1, 0 };
        System.out.println(min(arr));
    }

    // the method for finding the minimum value
    // we want to assume that arr.length != 0
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}