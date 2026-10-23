/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateTotalStockQuantities` for Retail Billing with Returns and Stock Reconciliation
 * Relevant starter snippet: System.out.println("Total Stock quantities: " + calculateTotalStockQuantities(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalStockQuantities(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied stock quantities. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Stock quantities: 13
 */
/* Correction: implemented calculateTotalStockQuantities as required by the issue; the starter omitted this method. */
public class Issue59_VH06_RetailBillingWithReturnsAndStockReconciliation {
    public static void main(String[] args) {
        System.out.println("Total Stock quantities: " + calculateTotalStockQuantities(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalStockQuantities(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalStockQuantities.
    static int calculateTotalStockQuantities(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
