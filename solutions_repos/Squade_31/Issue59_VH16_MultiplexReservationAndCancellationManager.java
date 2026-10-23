/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `findShowBookingIndex` for Multiplex Reservation and Cancellation Manager
 * Relevant starter snippet: System.out.println("Show booking index: " + findShowBookingIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findShowBookingIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested show booking ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use coll
 * Expected sample output:
 * Show booking index: 2
 */
/* Correction: implemented findShowBookingIndex as required by the issue; the starter omitted this method. */
public class Issue59_VH16_MultiplexReservationAndCancellationManager {
    public static void main(String[] args) {
        System.out.println("Show booking index: " + findShowBookingIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findShowBookingIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findShowBookingIndex.
    static int findShowBookingIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
