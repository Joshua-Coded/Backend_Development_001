// functional interface is an interface with only one method.

@FunctionalInterface
interface A {
    int mul(int i, int j);
}

public class FuncInterface {
    public static void main(String[] args) {
        A obj = (i, j) -> i * j;

        int result = obj.mul(3, 4);
        System.out.println(result);
    }
}