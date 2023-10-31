public class IntArray {
    public static void main(String[] args) {
        int[][] dArray = new int[2][3];
        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                dArray[i][j] = j;
                System.out.print(dArray[i][j] + " ");

            }
            System.out.println("");
        }
    }
}