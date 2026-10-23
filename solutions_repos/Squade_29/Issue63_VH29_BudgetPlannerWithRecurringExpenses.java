/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `findHighestBudgetBalances` for Budget Planner with Recurring Expenses
 * Relevant starter snippet: System.out.println("Highest Budget balances: " + findHighestBudgetBalances(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestBudgetBalances(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied budget balances array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Highest Budget balances: 18
 */
/* Correction: implemented findHighestBudgetBalances as required by the issue; the starter omitted this method. */
public class Issue63_VH29_BudgetPlannerWithRecurringExpenses {
    public static void main(String[] args) {
        System.out.println("Highest Budget balances: " + findHighestBudgetBalances(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestBudgetBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestBudgetBalances.
    static int findHighestBudgetBalances(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
