/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `countAvailableAuditThreshold` for Inventory Audit and Discrepancy Resolver
 * Relevant starter snippet: System.out.println("Available Audit threshold: " + countAvailableAuditThreshold(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableAuditThreshold(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available audit threshold. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Available Audit threshold: 3
 */
/* Correction: implemented countAvailableAuditThreshold as required by the issue; the starter omitted this method. */
public class Issue63_VH27_InventoryAuditAndDiscrepancyResolver {
    public static void main(String[] args) {
        System.out.println("Available Audit threshold: " + countAvailableAuditThreshold(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableAuditThreshold(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableAuditThreshold.
    static int countAvailableAuditThreshold(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
