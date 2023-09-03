import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a number : ");
        int n = s.nextInt();

        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;

        System.out.println(sum + n);

    }
}