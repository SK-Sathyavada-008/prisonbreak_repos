/*
 * CORRECTION NOTES
 * Buggy snippet: values.length + 1
 * Corrected snippet: values.length
 * Explanation: Average must divide by the number of entries, not one more.
 * Buggy snippet: "Average Available blood units:
 * Corrected snippet: "Average available blood units:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue46_BloodDonorAverage {
    public static void main(String[] args) {
        int[] values = {60, 80, 100};
        int total = 0;
        for (int value : values) total += value;
        double average = (double) total / (values.length);
        System.out.println("Average available blood units: " + average);
    }
}