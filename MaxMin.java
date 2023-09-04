import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = n;
        int min = n;

        if (n >= 0) {
            while (true) {
                int n = s.nextInt();

                if (n < 0)
                    break;

                if (n > max)
                    max = n;

                if (n < min)
                    min = n;
            }
            System.out.println("min=" + min + " max=" + max);
        }

        else {
            System.out.println(n + "is invalid");
        }

    }
}