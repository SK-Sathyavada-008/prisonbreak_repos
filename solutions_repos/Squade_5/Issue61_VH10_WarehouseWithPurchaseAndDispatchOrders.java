/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateStockQuantitiesPercentage` for Warehouse with Purchase and Dispatch Orders
 * Relevant starter snippet: System.out.println("Stock quantities percentage: " + calculateStockQuantitiesPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateStockQuantitiesPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic 
 * Expected sample output:
 * Stock quantities percentage: 75.0
 */
/* Correction: implemented calculateStockQuantitiesPercentage as required by the issue; the starter omitted this method. */
public class Issue61_VH10_WarehouseWithPurchaseAndDispatchOrders {
    public static void main(String[] args) {
        System.out.println("Stock quantities percentage: " + calculateStockQuantitiesPercentage(3, 4));
    }

    // Required method signature: static double calculateStockQuantitiesPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateStockQuantitiesPercentage.
    static double calculateStockQuantitiesPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
