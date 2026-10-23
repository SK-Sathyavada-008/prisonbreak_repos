/*
 * CORRECTION NOTES
 * Buggy snippet: for (int i = 0; i < values.length - 1
 * Corrected snippet: for (int i = 0; i < values.length
 * Explanation: The loop skipped the final element.
 * Buggy snippet: "Total Recharge balance:
 * Corrected snippet: "Total recharge balance:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue45_MobileRechargeTotal {
    public static void main(String[] args) {
        int[] values = {2, 3, 4};
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        System.out.println("Total recharge balance: " + total);
    }
}