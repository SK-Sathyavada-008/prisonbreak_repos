/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `countAvailableEventCapacity` for College Fest Registration and Event Allocation
 * Relevant starter snippet: System.out.println("Available Event capacity: " + countAvailableEventCapacity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableEventCapacity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available event capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Event capacity: 3
 */
/* Correction: implemented countAvailableEventCapacity as required by the issue; the starter omitted this method. */
public class Issue64_VH18_CollegeFestRegistrationAndEventAllocation {
    public static void main(String[] args) {
        System.out.println("Available Event capacity: " + countAvailableEventCapacity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableEventCapacity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableEventCapacity.
    static int countAvailableEventCapacity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
