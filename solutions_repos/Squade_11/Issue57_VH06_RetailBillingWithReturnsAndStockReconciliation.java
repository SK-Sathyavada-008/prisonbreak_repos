/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `findLowestStockQuantities` for Retail Billing with Returns and Stock Reconciliation
 * Relevant starter snippet: System.out.println("Lowest Stock quantities: " + findLowestStockQuantities(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestStockQuantities(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied stock quantities array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external lib
 * Expected sample output:
 * Lowest Stock quantities: 4
 */
/* Correction: implemented findLowestStockQuantities as required by the issue; the starter omitted this method. */
public class Issue57_VH06_RetailBillingWithReturnsAndStockReconciliation {
    public static void main(String[] args) {
        System.out.println("Lowest Stock quantities: " + findLowestStockQuantities(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestStockQuantities(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestStockQuantities.
    static int findLowestStockQuantities(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
