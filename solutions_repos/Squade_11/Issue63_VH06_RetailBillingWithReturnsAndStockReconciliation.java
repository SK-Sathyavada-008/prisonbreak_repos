/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateRemainingReturnLimit` for Retail Billing with Returns and Stock Reconciliation
 * Relevant starter snippet: System.out.println("Remaining Return limit: " + calculateRemainingReturnLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingReturnLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many return limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs
 * Expected sample output:
 * Remaining Return limit: 5
 */
/* Correction: implemented calculateRemainingReturnLimit as required by the issue; the starter omitted this method. */
public class Issue63_VH06_RetailBillingWithReturnsAndStockReconciliation {
    public static void main(String[] args) {
        System.out.println("Remaining Return limit: " + calculateRemainingReturnLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingReturnLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingReturnLimit.
    static int calculateRemainingReturnLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
