/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `countAvailableBedCapacity` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Available Bed capacity: " + countAvailableBedCapacity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableBedCapacity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available bed capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance
 * Expected sample output:
 * Available Bed capacity: 3
 */
/* Correction: implemented countAvailableBedCapacity as required by the issue; the starter omitted this method. */
public class Issue64_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Available Bed capacity: " + countAvailableBedCapacity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableBedCapacity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableBedCapacity.
    static int countAvailableBedCapacity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
