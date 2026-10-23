/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateDiscountedWardCharge` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Discounted Ward charge: " + calculateDiscountedWardCharge(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedWardCharge(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inhe
 * Expected sample output:
 * Discounted Ward charge: 180.0
 */
/* Correction: implemented calculateDiscountedWardCharge as required by the issue; the starter omitted this method. */
public class Issue62_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Discounted Ward charge: " + calculateDiscountedWardCharge(200, 10));
    }

    // Required method signature: static double calculateDiscountedWardCharge(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedWardCharge.
    static double calculateDiscountedWardCharge(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
