/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `findLibraryMemberIndex` for Library with Reservations and Overdue Fines
 * Relevant starter snippet: System.out.println("Library member index: " + findLibraryMemberIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findLibraryMemberIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested library member ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use 
 * Expected sample output:
 * Library member index: 2
 */
/* Correction: implemented findLibraryMemberIndex as required by the issue; the starter omitted this method. */
public class Issue62_VH05_LibraryWithReservationsAndOverdueFines {
    public static void main(String[] args) {
        System.out.println("Library member index: " + findLibraryMemberIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findLibraryMemberIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLibraryMemberIndex.
    static int findLibraryMemberIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
