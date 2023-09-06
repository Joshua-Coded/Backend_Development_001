// write a program that displays the number occurrences  of an element in the array.

public class Occur {
    public static void main(String[] args) {
        int[] numbers = { 1, 1, 2, 3, 4, 5, 6, 7, };
        int element = 1;

        // print the method
        System.out.println(getNumberOcc(numbers, element));
    }

    public static int getNumberOcc(int[] numbers, int element) {
        int occ = 0;
        for (int i = 0; i < numbers.length; i++)
            if (element == numbers[i])
                occ++;

        return occ;
    }
}