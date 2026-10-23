/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `countAvailableClassCapacity` for College Registration with Timetable Conflicts
 * Relevant starter snippet: System.out.println("Available Class capacity: " + countAvailableClassCapacity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableClassCapacity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available class capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Class capacity: 3
 */
/* Correction: implemented countAvailableClassCapacity as required by the issue; the starter omitted this method. */
public class Issue59_VH07_CollegeRegistrationWithTimetableConflicts {
    public static void main(String[] args) {
        System.out.println("Available Class capacity: " + countAvailableClassCapacity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableClassCapacity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableClassCapacity.
    static int countAvailableClassCapacity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
