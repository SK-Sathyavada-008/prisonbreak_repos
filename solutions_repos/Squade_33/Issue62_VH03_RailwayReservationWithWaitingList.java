/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateTotalConfirmedSeats` for Railway Reservation with Waiting List
 * Relevant starter snippet: System.out.println("Total Confirmed seats: " + calculateTotalConfirmedSeats(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalConfirmedSeats(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied confirmed seats. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Confirmed seats: 13
 */
/* Correction: implemented calculateTotalConfirmedSeats as required by the issue; the starter omitted this method. */
public class Issue62_VH03_RailwayReservationWithWaitingList {
    public static void main(String[] args) {
        System.out.println("Total Confirmed seats: " + calculateTotalConfirmedSeats(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalConfirmedSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalConfirmedSeats.
    static int calculateTotalConfirmedSeats(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
