public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 7, 2, 45 };
        int target = 45;
        int ans = searchInRange(arr, target, 1, 4);
        System.out.println("Searched: " + ans);
    }

    // the methods for searching in range
    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                int element = arr[i];
                if (element == target) {
                    return element;
                }
            }
            return -1;
        }
    }
}