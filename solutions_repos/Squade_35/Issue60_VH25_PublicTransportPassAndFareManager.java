/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `countAtLeastValidPasses` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Values meeting threshold: " + countAtLeastValidPasses(new int[] {2, 5, 1, 7}, 4));
 * Corrected solution snippet: for (int value : values) if (value >= threshold) count++;
 * Explanation: The starter calls `countAtLeastValidPasses(int[] values, int threshold)`, but the method has not been written. Write this method from scratch. Count how many supplied valid passes values are at least the given threshold. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inh
 * Expected sample output:
 * Values meeting threshold: 2
 */
/* Correction: implemented countAtLeastValidPasses as required by the issue; the starter omitted this method. */
public class Issue60_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Values meeting threshold: " + countAtLeastValidPasses(new int[] {2, 5, 1, 7}, 4));
    }

    // Required method signature: static int countAtLeastValidPasses(int[] values, int threshold)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAtLeastValidPasses.
    static int countAtLeastValidPasses(int[] values, int threshold) {
        int count = 0;
        for (int value : values) if (value >= threshold) count++;
        return count;
    }
}
