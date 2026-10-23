/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateRemainingClassCapacity` for College Registration with Timetable Conflicts
 * Relevant starter snippet: System.out.println("Remaining Class capacity: " + calculateRemainingClassCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingClassCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many class capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Class capacity: 5
 */
/* Correction: implemented calculateRemainingClassCapacity as required by the issue; the starter omitted this method. */
public class Issue62_VH07_CollegeRegistrationWithTimetableConflicts {
    public static void main(String[] args) {
        System.out.println("Remaining Class capacity: " + calculateRemainingClassCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingClassCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingClassCapacity.
    static int calculateRemainingClassCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
