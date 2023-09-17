// functional interface are interfaces with only one method.

@FunctionalInterface
interface A {
    void show(int i, int j);
}

public class FuncInterface {
    public static void main(String[] args) {
        A obj = (int i, int j) -> System.out.println("in a show" + i + j);
        obj.show(3, 10);
    }
}