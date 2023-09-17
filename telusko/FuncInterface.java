// functional interface are interfaces with only one method.

@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class FuncInterface {
    public static void main(String[] args) {
        A obj = new A() {
            public int add(int i, int j) {
                return i + j;
            }
        };

        int result = obj.add(3, 4);
        System.out.println(result);
    }
}