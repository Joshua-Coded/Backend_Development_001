
public class Pal {
    public static void main(String[] args) {
        // write a program that checks for the existence of a palindrome

        String str = "alana";

        boolean isPalindrone = true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j))
                continue;

            isPalindrone = false;
            break;
        }

        System.out.println(isPalindrone ? " Palindrone  found " : " not a palindrone");

    }
}