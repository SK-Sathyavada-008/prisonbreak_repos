/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findParkingTicketIndex` for Multi-Floor Parking Allocation and Billing
 * Relevant starter snippet: System.out.println("Parking ticket index: " + findParkingTicketIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findParkingTicketIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested parking ticket ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use 
 * Expected sample output:
 * Parking ticket index: 2
 */
/* Correction: implemented findParkingTicketIndex as required by the issue; the starter omitted this method. */
public class Issue60_VH30_MultiFloorParkingAllocationAndBilling {
    public static void main(String[] args) {
        System.out.println("Parking ticket index: " + findParkingTicketIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findParkingTicketIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findParkingTicketIndex.
    static int findParkingTicketIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
