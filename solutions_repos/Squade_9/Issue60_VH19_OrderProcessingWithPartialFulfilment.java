/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findLowestPendingQuantities` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Lowest Pending quantities: " + findLowestPendingQuantities(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestPendingQuantities(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied pending quantities array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external
 * Expected sample output:
 * Lowest Pending quantities: 4
 */
/* Correction: implemented findLowestPendingQuantities as required by the issue; the starter omitted this method. */
public class Issue60_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Lowest Pending quantities: " + findLowestPendingQuantities(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestPendingQuantities(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestPendingQuantities.
    static int findLowestPendingQuantities(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
