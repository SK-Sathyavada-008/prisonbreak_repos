/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `countAvailableReturnLimit` for Retail Billing with Returns and Stock Reconciliation
 * Relevant starter snippet: System.out.println("Available Return limit: " + countAvailableReturnLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableReturnLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available return limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance
 * Expected sample output:
 * Available Return limit: 3
 */
/* Correction: implemented countAvailableReturnLimit as required by the issue; the starter omitted this method. */
public class Issue60_VH06_RetailBillingWithReturnsAndStockReconciliation {
    public static void main(String[] args) {
        System.out.println("Available Return limit: " + countAvailableReturnLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableReturnLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableReturnLimit.
    static int countAvailableReturnLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
