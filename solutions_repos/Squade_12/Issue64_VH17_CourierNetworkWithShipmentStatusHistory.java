/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateTotalActiveParcels` for Courier Network with Shipment Status History
 * Relevant starter snippet: System.out.println("Total Active parcels: " + calculateTotalActiveParcels(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalActiveParcels(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied active parcels. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Active parcels: 13
 */
/* Correction: implemented calculateTotalActiveParcels as required by the issue; the starter omitted this method. */
public class Issue64_VH17_CourierNetworkWithShipmentStatusHistory {
    public static void main(String[] args) {
        System.out.println("Total Active parcels: " + calculateTotalActiveParcels(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalActiveParcels(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalActiveParcels.
    static int calculateTotalActiveParcels(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
