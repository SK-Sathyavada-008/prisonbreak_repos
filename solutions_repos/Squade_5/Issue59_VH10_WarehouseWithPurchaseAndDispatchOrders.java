/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateRemainingDispatchLimit` for Warehouse with Purchase and Dispatch Orders
 * Relevant starter snippet: System.out.println("Remaining Dispatch limit: " + calculateRemainingDispatchLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingDispatchLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many dispatch limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Dispatch limit: 5
 */
/* Correction: implemented calculateRemainingDispatchLimit as required by the issue; the starter omitted this method. */
public class Issue59_VH10_WarehouseWithPurchaseAndDispatchOrders {
    public static void main(String[] args) {
        System.out.println("Remaining Dispatch limit: " + calculateRemainingDispatchLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingDispatchLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingDispatchLimit.
    static int calculateRemainingDispatchLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
