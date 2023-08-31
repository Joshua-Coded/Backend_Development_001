import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // define the array with the number of memory allocated
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        // print out the variables
        System.out.println(Arrays.toString(numbers));
    }
}