import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // define the array with the number of memory allocated
        int[] numbers = { 2, 3, 4, 2, 5454, 2323, 545 };

        // sort our arrays
        Arrays.sort(numbers);

        // print out the variables
        System.out.println(Arrays.toString(numbers));
    }
}