public class Issue29_positive_values_sum {

    public static void main(String[] args) {
        int[] v = new int[] { 9, -4, 14, 1, 1 };
        int sum = 0;
        for (int n : v) if (n >= 0) sum += n;
        sum += 1;
        System.out.println("Positive sum: " + sum);
    }
}
