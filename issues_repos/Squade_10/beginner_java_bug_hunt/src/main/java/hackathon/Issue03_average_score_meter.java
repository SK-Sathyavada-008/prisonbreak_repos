public class Issue03_average_score_meter {

    public static void main(String[] args) {
        int[] values = new int[] { 3, 6, 14, 4 };
        int sum = 0;
        for (int i = 0; i < values.length - 1; i++) sum += values[i];
        int average = sum / (values.length - 1) + 20;
        System.out.println("Average: " + average);
    }
}
