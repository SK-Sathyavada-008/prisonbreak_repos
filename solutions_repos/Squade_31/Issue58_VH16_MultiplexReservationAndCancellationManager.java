/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `countAvailableScreenCapacity` for Multiplex Reservation and Cancellation Manager
 * Relevant starter snippet: System.out.println("Available Screen capacity: " + countAvailableScreenCapacity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableScreenCapacity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available screen capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Available Screen capacity: 3
 */
/* Correction: implemented countAvailableScreenCapacity as required by the issue; the starter omitted this method. */
public class Issue58_VH16_MultiplexReservationAndCancellationManager {
    public static void main(String[] args) {
        System.out.println("Available Screen capacity: " + countAvailableScreenCapacity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableScreenCapacity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableScreenCapacity.
    static int countAvailableScreenCapacity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
