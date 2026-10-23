/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findLowestStockDifferences` for Inventory Audit and Discrepancy Resolver
 * Relevant starter snippet: System.out.println("Lowest Stock differences: " + findLowestStockDifferences(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestStockDifferences(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied stock differences array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external l
 * Expected sample output:
 * Lowest Stock differences: 4
 */
/* Correction: implemented findLowestStockDifferences as required by the issue; the starter omitted this method. */
public class Issue60_VH27_InventoryAuditAndDiscrepancyResolver {
    public static void main(String[] args) {
        System.out.println("Lowest Stock differences: " + findLowestStockDifferences(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestStockDifferences(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestStockDifferences.
    static int findLowestStockDifferences(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
