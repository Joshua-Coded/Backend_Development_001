// write a program that displays the reverse of a string
public class Main {
    public static void main(String[] args) {
        String str = "alana";
        String reverse = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.print(reverse);
    }
}