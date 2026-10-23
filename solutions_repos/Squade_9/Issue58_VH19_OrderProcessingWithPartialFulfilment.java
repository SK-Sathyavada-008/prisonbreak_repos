/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateRemainingOrderLimit` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Remaining Order limit: " + calculateRemainingOrderLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingOrderLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many order limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; 
 * Expected sample output:
 * Remaining Order limit: 5
 */
/* Correction: implemented calculateRemainingOrderLimit as required by the issue; the starter omitted this method. */
public class Issue58_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Remaining Order limit: " + calculateRemainingOrderLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingOrderLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingOrderLimit.
    static int calculateRemainingOrderLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
