/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findLowestQuizScores` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Lowest Quiz scores: " + findLowestQuizScores(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestQuizScores(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied quiz scores array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Lowest Quiz scores: 4
 */
/* Correction: implemented findLowestQuizScores as required by the issue; the starter omitted this method. */
public class Issue58_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Lowest Quiz scores: " + findLowestQuizScores(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestQuizScores(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestQuizScores.
    static int findLowestQuizScores(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
