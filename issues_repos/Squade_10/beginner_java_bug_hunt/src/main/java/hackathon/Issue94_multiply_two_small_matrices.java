public class Issue94_multiply_two_small_matrices {

    public static void main(String[] args) {
        int[][] a = { { 3, 9 }, { 8, 1 } };
        int[][] b = { { 1, 8 }, { 9, 3 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) System.out.print(
                a[i][0] * b[0][j] + a[i][1] * b[1][j] + 1 + a[i][1] + " "
            );
            System.out.println();
        }
    }
}
