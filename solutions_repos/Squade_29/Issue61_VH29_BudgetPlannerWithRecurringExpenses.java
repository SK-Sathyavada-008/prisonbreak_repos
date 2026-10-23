/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `countAvailableBudgetLimit` for Budget Planner with Recurring Expenses
 * Relevant starter snippet: System.out.println("Available Budget limit: " + countAvailableBudgetLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableBudgetLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available budget limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance
 * Expected sample output:
 * Available Budget limit: 3
 */
/* Correction: implemented countAvailableBudgetLimit as required by the issue; the starter omitted this method. */
public class Issue61_VH29_BudgetPlannerWithRecurringExpenses {
    public static void main(String[] args) {
        System.out.println("Available Budget limit: " + countAvailableBudgetLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableBudgetLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableBudgetLimit.
    static int countAvailableBudgetLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
