// write a program that  places odd elements of an array before the even number.

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] numbers = { 0, 2, 1, 8, 10, 7, -5, 3, 4, 6, 8 };

        int[] temp = new int[numbers.length];
        int j = 0;
        int k = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                temp[j++] = numbers[i];

            } else {
                temp[k--] = numbers[i];
            }
        }

        copyArray(temp, numbers);
        System.out.println(Arrays.toString(numbers));

    }

    // create a new method for copying temp array into a new array
    public static void copyArray(int[] temp, int[] numbers) {
        for (int i = 0; i < temp.length; i++) {
            numbers[i] = temp[i];
        }
    }
}