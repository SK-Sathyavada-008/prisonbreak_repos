/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findHotelBookingIndex` for Hotel Booking with Room Changes and Billing
 * Relevant starter snippet: System.out.println("Hotel booking index: " + findHotelBookingIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findHotelBookingIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested hotel booking ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use co
 * Expected sample output:
 * Hotel booking index: 2
 */
/* Correction: implemented findHotelBookingIndex as required by the issue; the starter omitted this method. */
public class Issue60_VH15_HotelBookingWithRoomChangesAndBilling {
    public static void main(String[] args) {
        System.out.println("Hotel booking index: " + findHotelBookingIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findHotelBookingIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHotelBookingIndex.
    static int findHotelBookingIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
