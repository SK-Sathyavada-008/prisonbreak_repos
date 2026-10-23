/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `countAvailableVoteLimit` for Election System with Constituencies and Recount
 * Relevant starter snippet: System.out.println("Available Vote limit: " + countAvailableVoteLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableVoteLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available vote limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or
 * Expected sample output:
 * Available Vote limit: 3
 */
/* Correction: implemented countAvailableVoteLimit as required by the issue; the starter omitted this method. */
public class Issue61_VH13_ElectionSystemWithConstituenciesAndRecount {
    public static void main(String[] args) {
        System.out.println("Available Vote limit: " + countAvailableVoteLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableVoteLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableVoteLimit.
    static int countAvailableVoteLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
