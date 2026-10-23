/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateRemainingStayLimit` for Hotel Booking with Room Changes and Billing
 * Relevant starter snippet: System.out.println("Remaining Stay limit: " + calculateRemainingStayLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingStayLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many stay limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do
 * Expected sample output:
 * Remaining Stay limit: 5
 */
/* Correction: implemented calculateRemainingStayLimit as required by the issue; the starter omitted this method. */
public class Issue61_VH15_HotelBookingWithRoomChangesAndBilling {
    public static void main(String[] args) {
        System.out.println("Remaining Stay limit: " + calculateRemainingStayLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingStayLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingStayLimit.
    static int calculateRemainingStayLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
