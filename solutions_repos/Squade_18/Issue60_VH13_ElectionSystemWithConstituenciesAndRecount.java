/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateTotalValidVotes` for Election System with Constituencies and Recount
 * Relevant starter snippet: System.out.println("Total Valid votes: " + calculateTotalValidVotes(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalValidVotes(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied valid votes. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Valid votes: 13
 */
/* Correction: implemented calculateTotalValidVotes as required by the issue; the starter omitted this method. */
public class Issue60_VH13_ElectionSystemWithConstituenciesAndRecount {
    public static void main(String[] args) {
        System.out.println("Total Valid votes: " + calculateTotalValidVotes(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalValidVotes(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalValidVotes.
    static int calculateTotalValidVotes(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
