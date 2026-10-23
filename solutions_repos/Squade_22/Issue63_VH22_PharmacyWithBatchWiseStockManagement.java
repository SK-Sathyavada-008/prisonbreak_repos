/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `findHighestAvailableMedicineUnits` for Pharmacy with Batch-wise Stock Management
 * Relevant starter snippet: System.out.println("Highest Available medicine units: " + findHighestAvailableMedicineUnits(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableMedicineUnits(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available medicine units array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, 
 * Expected sample output:
 * Highest Available medicine units: 18
 */
/* Correction: implemented findHighestAvailableMedicineUnits as required by the issue; the starter omitted this method. */
public class Issue63_VH22_PharmacyWithBatchWiseStockManagement {
    public static void main(String[] args) {
        System.out.println("Highest Available medicine units: " + findHighestAvailableMedicineUnits(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableMedicineUnits(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableMedicineUnits.
    static int findHighestAvailableMedicineUnits(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
