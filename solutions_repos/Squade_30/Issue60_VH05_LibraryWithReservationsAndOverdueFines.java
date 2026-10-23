/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateTotalAvailableCopies` for Library with Reservations and Overdue Fines
 * Relevant starter snippet: System.out.println("Total Available copies: " + calculateTotalAvailableCopies(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableCopies(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available copies. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Available copies: 13
 */
/* Correction: implemented calculateTotalAvailableCopies as required by the issue; the starter omitted this method. */
public class Issue60_VH05_LibraryWithReservationsAndOverdueFines {
    public static void main(String[] args) {
        System.out.println("Total Available copies: " + calculateTotalAvailableCopies(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableCopies(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableCopies.
    static int calculateTotalAvailableCopies(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
