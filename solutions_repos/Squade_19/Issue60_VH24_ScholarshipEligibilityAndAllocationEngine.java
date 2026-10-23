/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateRemainingMarksCutoff` for Scholarship Eligibility and Allocation Engine
 * Relevant starter snippet: System.out.println("Remaining Marks cutoff: " + calculateRemainingMarksCutoff(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingMarksCutoff(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many marks cutoff remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs
 * Expected sample output:
 * Remaining Marks cutoff: 5
 */
/* Correction: implemented calculateRemainingMarksCutoff as required by the issue; the starter omitted this method. */
public class Issue60_VH24_ScholarshipEligibilityAndAllocationEngine {
    public static void main(String[] args) {
        System.out.println("Remaining Marks cutoff: " + calculateRemainingMarksCutoff(12, 7));
    }

    // Required method signature: static int calculateRemainingMarksCutoff(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingMarksCutoff.
    static int calculateRemainingMarksCutoff(int capacity, int occupied) {
        return capacity - occupied;
    }
}
