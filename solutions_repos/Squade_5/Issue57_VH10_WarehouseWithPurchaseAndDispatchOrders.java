/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `findWarehouseItemIndex` for Warehouse with Purchase and Dispatch Orders
 * Relevant starter snippet: System.out.println("Warehouse item index: " + findWarehouseItemIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findWarehouseItemIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested warehouse item ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use 
 * Expected sample output:
 * Warehouse item index: 2
 */
/* Correction: implemented findWarehouseItemIndex as required by the issue; the starter omitted this method. */
public class Issue57_VH10_WarehouseWithPurchaseAndDispatchOrders {
    public static void main(String[] args) {
        System.out.println("Warehouse item index: " + findWarehouseItemIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findWarehouseItemIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findWarehouseItemIndex.
    static int findWarehouseItemIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
