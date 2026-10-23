/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `countAvailableOrderLimit` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Available Order limit: " + countAvailableOrderLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableOrderLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available order limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, 
 * Expected sample output:
 * Available Order limit: 3
 */
/* Correction: implemented countAvailableOrderLimit as required by the issue; the starter omitted this method. */
public class Issue63_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Available Order limit: " + countAvailableOrderLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableOrderLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableOrderLimit.
    static int countAvailableOrderLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
