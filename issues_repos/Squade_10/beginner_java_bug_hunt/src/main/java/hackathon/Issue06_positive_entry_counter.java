public class Issue06_positive_entry_counter {

    public static void main(String[] args) {
        int[] v = new int[] { 3, -10, 9, 1, 11 };
        int count = 0;
        for (int i = 0; i < v.length; i++) if (v[i] >= 0) count++;
        count++;
        System.out.println("Count: " + count);
    }
}
