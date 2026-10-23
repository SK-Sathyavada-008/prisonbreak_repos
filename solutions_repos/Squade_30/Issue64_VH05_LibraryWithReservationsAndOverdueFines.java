/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateRemainingBorrowingLimit` for Library with Reservations and Overdue Fines
 * Relevant starter snippet: System.out.println("Remaining Borrowing limit: " + calculateRemainingBorrowingLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingBorrowingLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many borrowing limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java cons
 * Expected sample output:
 * Remaining Borrowing limit: 5
 */
/* Correction: implemented calculateRemainingBorrowingLimit as required by the issue; the starter omitted this method. */
public class Issue64_VH05_LibraryWithReservationsAndOverdueFines {
    public static void main(String[] args) {
        System.out.println("Remaining Borrowing limit: " + calculateRemainingBorrowingLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingBorrowingLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingBorrowingLimit.
    static int calculateRemainingBorrowingLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
