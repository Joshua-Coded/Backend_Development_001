public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 1;
        b = (byte) (a << 1);
        System.out.println("original value of a: " + a);
        System.out.println("i and b: " + i + "" + b);
    }
}