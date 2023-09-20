package methods.task_2;

public class Main {
    public static void main(String[] args) {
        printPrimeBetween(1, 60);
    }

    // method for isPrime
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // methods for printing primebetween
    public static void printPrimeBetween(int start, int end) {
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
