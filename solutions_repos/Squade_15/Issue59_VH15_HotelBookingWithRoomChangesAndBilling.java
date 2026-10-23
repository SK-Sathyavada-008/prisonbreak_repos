/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `countAvailableStayLimit` for Hotel Booking with Room Changes and Billing
 * Relevant starter snippet: System.out.println("Available Stay limit: " + countAvailableStayLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableStayLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available stay limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or
 * Expected sample output:
 * Available Stay limit: 3
 */
/* Correction: implemented countAvailableStayLimit as required by the issue; the starter omitted this method. */
public class Issue59_VH15_HotelBookingWithRoomChangesAndBilling {
    public static void main(String[] args) {
        System.out.println("Available Stay limit: " + countAvailableStayLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableStayLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableStayLimit.
    static int countAvailableStayLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
