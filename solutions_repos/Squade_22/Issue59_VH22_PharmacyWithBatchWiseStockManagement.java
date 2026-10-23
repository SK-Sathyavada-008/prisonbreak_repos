/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateTotalAvailableMedicineUnits` for Pharmacy with Batch-wise Stock Management
 * Relevant starter snippet: System.out.println("Total Available medicine units: " + calculateTotalAvailableMedicineUnits(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableMedicineUnits(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available medicine units. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or externa
 * Expected sample output:
 * Total Available medicine units: 13
 */
/* Correction: implemented calculateTotalAvailableMedicineUnits as required by the issue; the starter omitted this method. */
public class Issue59_VH22_PharmacyWithBatchWiseStockManagement {
    public static void main(String[] args) {
        System.out.println("Total Available medicine units: " + calculateTotalAvailableMedicineUnits(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableMedicineUnits(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableMedicineUnits.
    static int calculateTotalAvailableMedicineUnits(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
