public class MultiArray {
    public static void main(String[] args) {
        String[][] names = {
                { "mr.", "mrs. ,", "ms. " },
                { "smith", "jones" } };

        System.out.println(names[0][0] + names[0][1]);
        System.out.println(names[1][0] + names[1][1]);
    }
}