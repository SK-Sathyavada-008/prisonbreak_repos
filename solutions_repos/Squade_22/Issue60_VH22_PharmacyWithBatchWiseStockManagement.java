/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `countAvailableBatchQuantity` for Pharmacy with Batch-wise Stock Management
 * Relevant starter snippet: System.out.println("Available Batch quantity: " + countAvailableBatchQuantity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableBatchQuantity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available batch quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Batch quantity: 3
 */
/* Correction: implemented countAvailableBatchQuantity as required by the issue; the starter omitted this method. */
public class Issue60_VH22_PharmacyWithBatchWiseStockManagement {
    public static void main(String[] args) {
        System.out.println("Available Batch quantity: " + countAvailableBatchQuantity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableBatchQuantity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableBatchQuantity.
    static int countAvailableBatchQuantity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
