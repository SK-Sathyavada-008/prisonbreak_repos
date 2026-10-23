/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateTotalBudgetBalances` for Budget Planner with Recurring Expenses
 * Relevant starter snippet: System.out.println("Total Budget balances: " + calculateTotalBudgetBalances(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalBudgetBalances(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied budget balances. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Budget balances: 13
 */
/* Correction: implemented calculateTotalBudgetBalances as required by the issue; the starter omitted this method. */
public class Issue60_VH29_BudgetPlannerWithRecurringExpenses {
    public static void main(String[] args) {
        System.out.println("Total Budget balances: " + calculateTotalBudgetBalances(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalBudgetBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalBudgetBalances.
    static int calculateTotalBudgetBalances(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
