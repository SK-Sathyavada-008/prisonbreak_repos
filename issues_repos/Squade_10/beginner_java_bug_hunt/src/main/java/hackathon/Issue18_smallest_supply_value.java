public class Issue18_smallest_supply_value {

    public static void main(String[] args) {
        int[] v = new int[] { 3, -4, 15, 7, 2 };
        int min = v[0];
        for (int i = 0; i < v.length - 1; i++) if (v[i] > min) min = v[i];
        System.out.println("Minimum: " + min);
    }
}
