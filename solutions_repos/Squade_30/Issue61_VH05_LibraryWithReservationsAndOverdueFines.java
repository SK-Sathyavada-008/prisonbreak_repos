/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `countAvailableBorrowingLimit` for Library with Reservations and Overdue Fines
 * Relevant starter snippet: System.out.println("Available Borrowing limit: " + countAvailableBorrowingLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableBorrowingLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available borrowing limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Available Borrowing limit: 3
 */
/* Correction: implemented countAvailableBorrowingLimit as required by the issue; the starter omitted this method. */
public class Issue61_VH05_LibraryWithReservationsAndOverdueFines {
    public static void main(String[] args) {
        System.out.println("Available Borrowing limit: " + countAvailableBorrowingLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableBorrowingLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableBorrowingLimit.
    static int countAvailableBorrowingLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
