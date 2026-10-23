/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateRemainingDeliveryLimit` for Courier Network with Shipment Status History
 * Relevant starter snippet: System.out.println("Remaining Delivery limit: " + calculateRemainingDeliveryLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingDeliveryLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many delivery limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Delivery limit: 5
 */
/* Correction: implemented calculateRemainingDeliveryLimit as required by the issue; the starter omitted this method. */
public class Issue59_VH17_CourierNetworkWithShipmentStatusHistory {
    public static void main(String[] args) {
        System.out.println("Remaining Delivery limit: " + calculateRemainingDeliveryLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingDeliveryLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingDeliveryLimit.
    static int calculateRemainingDeliveryLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
