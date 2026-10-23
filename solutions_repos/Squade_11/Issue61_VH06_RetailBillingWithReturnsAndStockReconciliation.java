/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `findSaleItemIndex` for Retail Billing with Returns and Stock Reconciliation
 * Relevant starter snippet: System.out.println("Sale item index: " + findSaleItemIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findSaleItemIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested sale item ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collection
 * Expected sample output:
 * Sale item index: 2
 */
/* Correction: implemented findSaleItemIndex as required by the issue; the starter omitted this method. */
public class Issue61_VH06_RetailBillingWithReturnsAndStockReconciliation {
    public static void main(String[] args) {
        System.out.println("Sale item index: " + findSaleItemIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findSaleItemIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findSaleItemIndex.
    static int findSaleItemIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
