/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `countAvailableConnectionLimit` for Airline Booking with Connecting Flights
 * Relevant starter snippet: System.out.println("Available Connection limit: " + countAvailableConnectionLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableConnectionLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available connection limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inh
 * Expected sample output:
 * Available Connection limit: 3
 */
/* Correction: implemented countAvailableConnectionLimit as required by the issue; the starter omitted this method. */
public class Issue58_VH08_AirlineBookingWithConnectingFlights {
    public static void main(String[] args) {
        System.out.println("Available Connection limit: " + countAvailableConnectionLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableConnectionLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableConnectionLimit.
    static int countAvailableConnectionLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
