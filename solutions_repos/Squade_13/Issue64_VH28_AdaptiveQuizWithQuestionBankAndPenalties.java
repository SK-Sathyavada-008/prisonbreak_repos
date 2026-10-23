/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateRemainingQuestionLimit` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Remaining Question limit: " + calculateRemainingQuestionLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingQuestionLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many question limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Question limit: 5
 */
/* Correction: implemented calculateRemainingQuestionLimit as required by the issue; the starter omitted this method. */
public class Issue64_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Remaining Question limit: " + calculateRemainingQuestionLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingQuestionLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingQuestionLimit.
    static int calculateRemainingQuestionLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
