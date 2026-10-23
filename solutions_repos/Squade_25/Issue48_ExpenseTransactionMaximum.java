/*
 * CORRECTION NOTES
 * Buggy snippet: int highest = 0;
 * Corrected snippet: int highest=values[0];
 * Explanation: Initialize maximum from the first value so all-negative arrays work.
 * Buggy snippet: "Highest Expense amounts:
 * Corrected snippet: "Highest expense amounts:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue48_ExpenseTransactionMaximum {
    public static void main(String[] args) {
        int[] values = {-8, -3, -11};
        int highest=values[0];
        for (int value : values) {
            if (value > highest) highest = value;
        }
        System.out.println("Highest expense amounts: " + highest);
    }
}