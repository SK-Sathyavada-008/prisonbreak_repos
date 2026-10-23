/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `findHighestConfirmedSeats` for Railway Reservation with Waiting List
 * Relevant starter snippet: System.out.println("Highest Confirmed seats: " + findHighestConfirmedSeats(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestConfirmedSeats(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied confirmed seats array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Highest Confirmed seats: 18
 */
/* Correction: implemented findHighestConfirmedSeats as required by the issue; the starter omitted this method. */
public class Issue59_VH03_RailwayReservationWithWaitingList {
    public static void main(String[] args) {
        System.out.println("Highest Confirmed seats: " + findHighestConfirmedSeats(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestConfirmedSeats(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestConfirmedSeats.
    static int findHighestConfirmedSeats(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
