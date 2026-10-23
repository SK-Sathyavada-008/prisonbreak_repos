/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `findHighestAvailableCopies` for Library with Reservations and Overdue Fines
 * Relevant starter snippet: System.out.println("Highest Available copies: " + findHighestAvailableCopies(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableCopies(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available copies array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external lib
 * Expected sample output:
 * Highest Available copies: 18
 */
/* Correction: implemented findHighestAvailableCopies as required by the issue; the starter omitted this method. */
public class Issue57_VH05_LibraryWithReservationsAndOverdueFines {
    public static void main(String[] args) {
        System.out.println("Highest Available copies: " + findHighestAvailableCopies(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableCopies(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableCopies.
    static int findHighestAvailableCopies(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
