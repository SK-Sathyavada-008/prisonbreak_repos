/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `isValidReceiveRequest` for Warehouse with Purchase and Dispatch Orders
 * Relevant starter snippet: System.out.println("Receive request valid: " + isValidReceiveRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidReceiveRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not 
 * Expected sample output:
 * Receive request valid: true
 */
/* Correction: implemented isValidReceiveRequest as required by the issue; the starter omitted this method. */
public class Issue58_VH10_WarehouseWithPurchaseAndDispatchOrders {
    public static void main(String[] args) {
        System.out.println("Receive request valid: " + isValidReceiveRequest(2, 5));
    }

    // Required method signature: static boolean isValidReceiveRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidReceiveRequest.
    static boolean isValidReceiveRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
