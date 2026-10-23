/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findHighestStockQuantities` for Warehouse with Purchase and Dispatch Orders
 * Relevant starter snippet: System.out.println("Highest Stock quantities: " + findHighestStockQuantities(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestStockQuantities(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied stock quantities array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external lib
 * Expected sample output:
 * Highest Stock quantities: 18
 */
/* Correction: implemented findHighestStockQuantities as required by the issue; the starter omitted this method. */
public class Issue60_VH10_WarehouseWithPurchaseAndDispatchOrders {
    public static void main(String[] args) {
        System.out.println("Highest Stock quantities: " + findHighestStockQuantities(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestStockQuantities(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestStockQuantities.
    static int findHighestStockQuantities(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
