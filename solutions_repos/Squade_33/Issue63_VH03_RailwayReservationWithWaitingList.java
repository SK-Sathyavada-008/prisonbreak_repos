/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `countAvailableCoachCapacity` for Railway Reservation with Waiting List
 * Relevant starter snippet: System.out.println("Available Coach capacity: " + countAvailableCoachCapacity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableCoachCapacity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available coach capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Coach capacity: 3
 */
/* Correction: implemented countAvailableCoachCapacity as required by the issue; the starter omitted this method. */
public class Issue63_VH03_RailwayReservationWithWaitingList {
    public static void main(String[] args) {
        System.out.println("Available Coach capacity: " + countAvailableCoachCapacity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableCoachCapacity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableCoachCapacity.
    static int countAvailableCoachCapacity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
