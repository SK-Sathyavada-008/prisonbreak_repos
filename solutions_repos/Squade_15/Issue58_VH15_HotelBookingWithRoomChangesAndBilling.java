/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateTotalAvailableRooms` for Hotel Booking with Room Changes and Billing
 * Relevant starter snippet: System.out.println("Total Available rooms: " + calculateTotalAvailableRooms(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableRooms(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available rooms. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Available rooms: 13
 */
/* Correction: implemented calculateTotalAvailableRooms as required by the issue; the starter omitted this method. */
public class Issue58_VH15_HotelBookingWithRoomChangesAndBilling {
    public static void main(String[] args) {
        System.out.println("Total Available rooms: " + calculateTotalAvailableRooms(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableRooms(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableRooms.
    static int calculateTotalAvailableRooms(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
