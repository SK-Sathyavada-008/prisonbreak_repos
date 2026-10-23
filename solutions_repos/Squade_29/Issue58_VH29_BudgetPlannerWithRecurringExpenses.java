/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findLowestBudgetBalances` for Budget Planner with Recurring Expenses
 * Relevant starter snippet: System.out.println("Lowest Budget balances: " + findLowestBudgetBalances(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestBudgetBalances(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied budget balances array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Lowest Budget balances: 4
 */
/* Correction: implemented findLowestBudgetBalances as required by the issue; the starter omitted this method. */
public class Issue58_VH29_BudgetPlannerWithRecurringExpenses {
    public static void main(String[] args) {
        System.out.println("Lowest Budget balances: " + findLowestBudgetBalances(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestBudgetBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestBudgetBalances.
    static int findLowestBudgetBalances(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
