/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findShipmentIndex` for Courier Network with Shipment Status History
 * Relevant starter snippet: System.out.println("Shipment index: " + findShipmentIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findShipmentIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested shipment ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections
 * Expected sample output:
 * Shipment index: 2
 */
/* Correction: implemented findShipmentIndex as required by the issue; the starter omitted this method. */
public class Issue58_VH17_CourierNetworkWithShipmentStatusHistory {
    public static void main(String[] args) {
        System.out.println("Shipment index: " + findShipmentIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findShipmentIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findShipmentIndex.
    static int findShipmentIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
