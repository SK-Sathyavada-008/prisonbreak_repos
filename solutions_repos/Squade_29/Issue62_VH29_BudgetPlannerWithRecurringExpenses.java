/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateRemainingBudgetLimit` for Budget Planner with Recurring Expenses
 * Relevant starter snippet: System.out.println("Remaining Budget limit: " + calculateRemainingBudgetLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingBudgetLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many budget limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs
 * Expected sample output:
 * Remaining Budget limit: 5
 */
/* Correction: implemented calculateRemainingBudgetLimit as required by the issue; the starter omitted this method. */
public class Issue62_VH29_BudgetPlannerWithRecurringExpenses {
    public static void main(String[] args) {
        System.out.println("Remaining Budget limit: " + calculateRemainingBudgetLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingBudgetLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingBudgetLimit.
    static int calculateRemainingBudgetLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
