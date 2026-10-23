/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `countAvailableQuestionLimit` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Available Question limit: " + countAvailableQuestionLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableQuestionLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available question limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Question limit: 3
 */
/* Correction: implemented countAvailableQuestionLimit as required by the issue; the starter omitted this method. */
public class Issue62_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Available Question limit: " + countAvailableQuestionLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableQuestionLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableQuestionLimit.
    static int countAvailableQuestionLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
