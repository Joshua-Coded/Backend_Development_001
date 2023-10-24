public class LocalVariables {
    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        LocalVariables local = new LocalVariables();
        int sum = local.sum(20);
        System.out.println("sum of the first 20 numbers ->" + sum);
        ;
    }
}