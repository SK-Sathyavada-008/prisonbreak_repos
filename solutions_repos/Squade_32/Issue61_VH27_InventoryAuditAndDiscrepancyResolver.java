/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateDiscountedStockQuantity` for Inventory Audit and Discrepancy Resolver
 * Relevant starter snippet: System.out.println("Discounted Stock quantity: " + calculateDiscountedStockQuantity(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedStockQuantity(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, i
 * Expected sample output:
 * Discounted Stock quantity: 180.0
 */
/* Correction: implemented calculateDiscountedStockQuantity as required by the issue; the starter omitted this method. */
public class Issue61_VH27_InventoryAuditAndDiscrepancyResolver {
    public static void main(String[] args) {
        System.out.println("Discounted Stock quantity: " + calculateDiscountedStockQuantity(200, 10));
    }

    // Required method signature: static double calculateDiscountedStockQuantity(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedStockQuantity.
    static double calculateDiscountedStockQuantity(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
