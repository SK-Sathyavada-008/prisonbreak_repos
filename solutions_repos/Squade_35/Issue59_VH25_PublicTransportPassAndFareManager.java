/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateRemainingPassDuration` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Remaining Pass duration: " + calculateRemainingPassDuration(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingPassDuration(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many pass duration remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java construc
 * Expected sample output:
 * Remaining Pass duration: 5
 */
/* Correction: implemented calculateRemainingPassDuration as required by the issue; the starter omitted this method. */
public class Issue59_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Remaining Pass duration: " + calculateRemainingPassDuration(12, 7));
    }

    // Required method signature: static int calculateRemainingPassDuration(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingPassDuration.
    static int calculateRemainingPassDuration(int capacity, int occupied) {
        return capacity - occupied;
    }
}
