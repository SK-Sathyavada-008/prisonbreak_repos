/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateTotalValidPasses` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Total Valid passes: " + calculateTotalValidPasses(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalValidPasses(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied valid passes. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Valid passes: 13
 */
/* Correction: implemented calculateTotalValidPasses as required by the issue; the starter omitted this method. */
public class Issue64_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Total Valid passes: " + calculateTotalValidPasses(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalValidPasses(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalValidPasses.
    static int calculateTotalValidPasses(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
