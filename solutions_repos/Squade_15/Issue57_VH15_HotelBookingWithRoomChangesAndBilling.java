/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `findLowestAvailableRooms` for Hotel Booking with Room Changes and Billing
 * Relevant starter snippet: System.out.println("Lowest Available rooms: " + findLowestAvailableRooms(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestAvailableRooms(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied available rooms array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Lowest Available rooms: 4
 */
/* Correction: implemented findLowestAvailableRooms as required by the issue; the starter omitted this method. */
public class Issue57_VH15_HotelBookingWithRoomChangesAndBilling {
    public static void main(String[] args) {
        System.out.println("Lowest Available rooms: " + findLowestAvailableRooms(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestAvailableRooms(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestAvailableRooms.
    static int findLowestAvailableRooms(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
