/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateDiscountedPointValue` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Discounted Point value: " + calculateDiscountedPointValue(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedPointValue(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inhe
 * Expected sample output:
 * Discounted Point value: 180.0
 */
/* Correction: implemented calculateDiscountedPointValue as required by the issue; the starter omitted this method. */
public class Issue60_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Discounted Point value: " + calculateDiscountedPointValue(200, 10));
    }

    // Required method signature: static double calculateDiscountedPointValue(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedPointValue.
    static double calculateDiscountedPointValue(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
