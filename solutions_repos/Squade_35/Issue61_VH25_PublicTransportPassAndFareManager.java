/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `findLowestValidPasses` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Lowest Valid passes: " + findLowestValidPasses(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestValidPasses(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied valid passes array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Lowest Valid passes: 4
 */
/* Correction: implemented findLowestValidPasses as required by the issue; the starter omitted this method. */
public class Issue61_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Lowest Valid passes: " + findLowestValidPasses(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestValidPasses(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestValidPasses.
    static int findLowestValidPasses(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
