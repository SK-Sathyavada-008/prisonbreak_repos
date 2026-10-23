/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `countAvailableRequestLimit` for Blood Bank with Donor and Request Matching
 * Relevant starter snippet: System.out.println("Available Request limit: " + countAvailableRequestLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableRequestLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available request limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritan
 * Expected sample output:
 * Available Request limit: 3
 */
/* Correction: implemented countAvailableRequestLimit as required by the issue; the starter omitted this method. */
public class Issue62_VH12_BloodBankWithDonorAndRequestMatching {
    public static void main(String[] args) {
        System.out.println("Available Request limit: " + countAvailableRequestLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableRequestLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableRequestLimit.
    static int countAvailableRequestLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
