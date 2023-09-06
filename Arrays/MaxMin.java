// write a program that displays the min and max values in an array

public class MaxMin {
    public static void main(String[] args) {
        int[] elements = { 1, 3, 4, -5, 6, 2, -7 };

        int min = elements[0];
        int max = elements[0];

        System.out.println(elements.length);

        for (int i = 1; i < elements.length; i++) {
            max = (elements[i] > max) ? elements[i] : max;
            min = (elements[i] < min) ? elements[i] : min;
        }

        System.out.println("Max= " + max + ", Min= " + min);

    }
}