/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateOverdueFine` for Library with Reservations and Overdue Fines
 * Relevant starter snippet: System.out.println("Total Overdue fine: " + calculateOverdueFine(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateOverdueFine(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit overdue fine and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance,
 * Expected sample output:
 * Total Overdue fine: 75
 */
/* Correction: implemented calculateOverdueFine as required by the issue; the starter omitted this method. */
public class Issue63_VH05_LibraryWithReservationsAndOverdueFines {
    public static void main(String[] args) {
        System.out.println("Total Overdue fine: " + calculateOverdueFine(25, 3));
    }

    // Required method signature: static int calculateOverdueFine(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateOverdueFine.
    static int calculateOverdueFine(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
