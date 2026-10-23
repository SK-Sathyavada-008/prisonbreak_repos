/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `countAvailablePassDuration` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Available Pass duration: " + countAvailablePassDuration(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailablePassDuration(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available pass duration. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritan
 * Expected sample output:
 * Available Pass duration: 3
 */
/* Correction: implemented countAvailablePassDuration as required by the issue; the starter omitted this method. */
public class Issue57_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Available Pass duration: " + countAvailablePassDuration(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailablePassDuration(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailablePassDuration.
    static int countAvailablePassDuration(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
