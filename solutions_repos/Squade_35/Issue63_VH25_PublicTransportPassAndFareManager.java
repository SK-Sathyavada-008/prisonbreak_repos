/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateDiscountedFareAmount` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Discounted Fare amount: " + calculateDiscountedFareAmount(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedFareAmount(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inhe
 * Expected sample output:
 * Discounted Fare amount: 180.0
 */
/* Correction: implemented calculateDiscountedFareAmount as required by the issue; the starter omitted this method. */
public class Issue63_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Discounted Fare amount: " + calculateDiscountedFareAmount(200, 10));
    }

    // Required method signature: static double calculateDiscountedFareAmount(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedFareAmount.
    static double calculateDiscountedFareAmount(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
