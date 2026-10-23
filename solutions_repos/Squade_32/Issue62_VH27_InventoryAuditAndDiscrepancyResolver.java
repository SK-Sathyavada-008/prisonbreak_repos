/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateTotalStockDifferences` for Inventory Audit and Discrepancy Resolver
 * Relevant starter snippet: System.out.println("Total Stock differences: " + calculateTotalStockDifferences(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalStockDifferences(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied stock differences. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Stock differences: 13
 */
/* Correction: implemented calculateTotalStockDifferences as required by the issue; the starter omitted this method. */
public class Issue62_VH27_InventoryAuditAndDiscrepancyResolver {
    public static void main(String[] args) {
        System.out.println("Total Stock differences: " + calculateTotalStockDifferences(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalStockDifferences(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalStockDifferences.
    static int calculateTotalStockDifferences(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
