/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `countAvailableDeliveryLimit` for Courier Network with Shipment Status History
 * Relevant starter snippet: System.out.println("Available Delivery limit: " + countAvailableDeliveryLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableDeliveryLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available delivery limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Delivery limit: 3
 */
/* Correction: implemented countAvailableDeliveryLimit as required by the issue; the starter omitted this method. */
public class Issue57_VH17_CourierNetworkWithShipmentStatusHistory {
    public static void main(String[] args) {
        System.out.println("Available Delivery limit: " + countAvailableDeliveryLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableDeliveryLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableDeliveryLimit.
    static int countAvailableDeliveryLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
