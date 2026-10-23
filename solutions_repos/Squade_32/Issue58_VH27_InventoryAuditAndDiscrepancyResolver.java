/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findHighestStockDifferences` for Inventory Audit and Discrepancy Resolver
 * Relevant starter snippet: System.out.println("Highest Stock differences: " + findHighestStockDifferences(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestStockDifferences(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied stock differences array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external l
 * Expected sample output:
 * Highest Stock differences: 18
 */
/* Correction: implemented findHighestStockDifferences as required by the issue; the starter omitted this method. */
public class Issue58_VH27_InventoryAuditAndDiscrepancyResolver {
    public static void main(String[] args) {
        System.out.println("Highest Stock differences: " + findHighestStockDifferences(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestStockDifferences(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestStockDifferences.
    static int findHighestStockDifferences(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
