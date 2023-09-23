// write a program that prints the prime number between two numbers.

public class Prime {
    public static void main(String[] args) {
        printPrimeBetween(20, 100);
    }

    // first method

    public static boolean isPrime(int n) {
        // write a divisor loop for prime numbers
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;

        }

        return true;
    }

    public static void printPrimeBetween(int start, int end) {
        // for loop for start and end numbers

        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                System.out.println(i + " ");
        }
    }

}