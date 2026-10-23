public class Issue90_odd_index_value_total {

    public static void main(String[] args) {
        int[] v = new int[] { 9, -11, 6, 8, 8 };
        int sum = 0;
        for (int i = 0; i < v.length - 1; i += 2) sum += v[i];
        System.out.println("Odd-index total: " + sum);
    }
}
