/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `findLowestAvailableSeats` for Multiplex Reservation and Cancellation Manager
 * Relevant starter snippet: System.out.println("Lowest Available seats: " + findLowestAvailableSeats(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestAvailableSeats(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied available seats array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Lowest Available seats: 4
 */
/* Correction: implemented findLowestAvailableSeats as required by the issue; the starter omitted this method. */
public class Issue63_VH16_MultiplexReservationAndCancellationManager {
    public static void main(String[] args) {
        System.out.println("Lowest Available seats: " + findLowestAvailableSeats(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestAvailableSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestAvailableSeats.
    static int findLowestAvailableSeats(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
