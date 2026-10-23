/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `containsExpenseCategory` for Budget Planner with Recurring Expenses
 * Relevant starter snippet: System.out.println("Expense category found: " + containsExpenseCategory(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsExpenseCategory(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested expense category text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; 
 * Expected sample output:
 * Expense category found: true
 */
/* Correction: implemented containsExpenseCategory as required by the issue; the starter omitted this method. */
public class Issue59_VH29_BudgetPlannerWithRecurringExpenses {
    public static void main(String[] args) {
        System.out.println("Expense category found: " + containsExpenseCategory(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsExpenseCategory(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsExpenseCategory.
    static boolean containsExpenseCategory(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
