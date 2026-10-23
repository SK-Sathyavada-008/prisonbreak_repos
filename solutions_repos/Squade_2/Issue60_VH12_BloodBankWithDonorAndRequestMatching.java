/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateDiscountedUnitCount` for Blood Bank with Donor and Request Matching
 * Relevant starter snippet: System.out.println("Discounted Unit count: " + calculateDiscountedUnitCount(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedUnitCount(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Discounted Unit count: 180.0
 */
/* Correction: implemented calculateDiscountedUnitCount as required by the issue; the starter omitted this method. */
public class Issue60_VH12_BloodBankWithDonorAndRequestMatching {
    public static void main(String[] args) {
        System.out.println("Discounted Unit count: " + calculateDiscountedUnitCount(200, 10));
    }

    // Required method signature: static double calculateDiscountedUnitCount(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedUnitCount.
    static double calculateDiscountedUnitCount(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
