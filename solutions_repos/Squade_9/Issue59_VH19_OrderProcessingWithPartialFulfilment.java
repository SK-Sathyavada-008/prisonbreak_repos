/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `findHighestPendingQuantities` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Highest Pending quantities: " + findHighestPendingQuantities(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestPendingQuantities(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied pending quantities array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external
 * Expected sample output:
 * Highest Pending quantities: 18
 */
/* Correction: implemented findHighestPendingQuantities as required by the issue; the starter omitted this method. */
public class Issue59_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Highest Pending quantities: " + findHighestPendingQuantities(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestPendingQuantities(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestPendingQuantities.
    static int findHighestPendingQuantities(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
