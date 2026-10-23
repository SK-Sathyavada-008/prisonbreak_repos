public class Issue30_even_position_total {

    public static void main(String[] args) {
        int[] v = new int[] { 3, -9, 8, 0, 10 };
        int sum = 0;
        for (int i = 1; i < v.length; i += 2) sum += v[i];
        sum++;
        System.out.println("Position total: " + sum);
    }
}
