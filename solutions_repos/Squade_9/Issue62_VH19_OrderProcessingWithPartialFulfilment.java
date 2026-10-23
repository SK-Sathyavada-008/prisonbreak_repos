/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateTotalPendingQuantities` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Total Pending quantities: " + calculateTotalPendingQuantities(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalPendingQuantities(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied pending quantities. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries
 * Expected sample output:
 * Total Pending quantities: 13
 */
/* Correction: implemented calculateTotalPendingQuantities as required by the issue; the starter omitted this method. */
public class Issue62_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Total Pending quantities: " + calculateTotalPendingQuantities(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalPendingQuantities(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalPendingQuantities.
    static int calculateTotalPendingQuantities(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
