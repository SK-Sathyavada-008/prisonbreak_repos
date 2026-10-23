/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `countAvailableMarksCutoff` for Scholarship Eligibility and Allocation Engine
 * Relevant starter snippet: System.out.println("Available Marks cutoff: " + countAvailableMarksCutoff(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableMarksCutoff(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available marks cutoff. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance
 * Expected sample output:
 * Available Marks cutoff: 3
 */
/* Correction: implemented countAvailableMarksCutoff as required by the issue; the starter omitted this method. */
public class Issue58_VH24_ScholarshipEligibilityAndAllocationEngine {
    public static void main(String[] args) {
        System.out.println("Available Marks cutoff: " + countAvailableMarksCutoff(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableMarksCutoff(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableMarksCutoff.
    static int countAvailableMarksCutoff(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
