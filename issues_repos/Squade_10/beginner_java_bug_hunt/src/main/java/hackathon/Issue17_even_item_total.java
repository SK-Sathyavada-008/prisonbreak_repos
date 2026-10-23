public class Issue17_even_item_total {

    public static void main(String[] args) {
        int[] v = new int[] { 9, -10, 8, 7, 10 };
        int sum = 0;
        for (int n : v) if (n % 2 == 0) sum += n;
        sum += 1;
        System.out.println("Even sum: " + sum);
    }
}
