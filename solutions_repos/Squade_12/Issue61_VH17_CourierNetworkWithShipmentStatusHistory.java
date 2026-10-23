/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `findLowestActiveParcels` for Courier Network with Shipment Status History
 * Relevant starter snippet: System.out.println("Lowest Active parcels: " + findLowestActiveParcels(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestActiveParcels(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied active parcels array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external librari
 * Expected sample output:
 * Lowest Active parcels: 4
 */
/* Correction: implemented findLowestActiveParcels as required by the issue; the starter omitted this method. */
public class Issue61_VH17_CourierNetworkWithShipmentStatusHistory {
    public static void main(String[] args) {
        System.out.println("Lowest Active parcels: " + findLowestActiveParcels(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestActiveParcels(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestActiveParcels.
    static int findLowestActiveParcels(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
