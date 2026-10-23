/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateRemainingRequestLimit` for Blood Bank with Donor and Request Matching
 * Relevant starter snippet: System.out.println("Remaining Request limit: " + calculateRemainingRequestLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingRequestLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many request limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java construc
 * Expected sample output:
 * Remaining Request limit: 5
 */
/* Correction: implemented calculateRemainingRequestLimit as required by the issue; the starter omitted this method. */
public class Issue57_VH12_BloodBankWithDonorAndRequestMatching {
    public static void main(String[] args) {
        System.out.println("Remaining Request limit: " + calculateRemainingRequestLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingRequestLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingRequestLimit.
    static int calculateRemainingRequestLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
