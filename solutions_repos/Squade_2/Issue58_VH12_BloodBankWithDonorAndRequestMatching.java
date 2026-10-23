/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateAvailableUnitsPercentage` for Blood Bank with Donor and Request Matching
 * Relevant starter snippet: System.out.println("Available units percentage: " + calculateAvailableUnitsPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateAvailableUnitsPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic J
 * Expected sample output:
 * Available units percentage: 75.0
 */
/* Correction: implemented calculateAvailableUnitsPercentage as required by the issue; the starter omitted this method. */
public class Issue58_VH12_BloodBankWithDonorAndRequestMatching {
    public static void main(String[] args) {
        System.out.println("Available units percentage: " + calculateAvailableUnitsPercentage(3, 4));
    }

    // Required method signature: static double calculateAvailableUnitsPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateAvailableUnitsPercentage.
    static double calculateAvailableUnitsPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
