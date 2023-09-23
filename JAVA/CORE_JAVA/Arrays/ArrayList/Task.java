import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int i = 0;
        for (Integer item : arr)
            System.out.println(item + " " + i++);
    }
}