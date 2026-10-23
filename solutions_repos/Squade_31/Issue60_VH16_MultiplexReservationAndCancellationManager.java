/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateRemainingScreenCapacity` for Multiplex Reservation and Cancellation Manager
 * Relevant starter snippet: System.out.println("Remaining Screen capacity: " + calculateRemainingScreenCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingScreenCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many screen capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java cons
 * Expected sample output:
 * Remaining Screen capacity: 5
 */
/* Correction: implemented calculateRemainingScreenCapacity as required by the issue; the starter omitted this method. */
public class Issue60_VH16_MultiplexReservationAndCancellationManager {
    public static void main(String[] args) {
        System.out.println("Remaining Screen capacity: " + calculateRemainingScreenCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingScreenCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingScreenCapacity.
    static int calculateRemainingScreenCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
