/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `findLowestEvaluationScores` for Project Evaluation and Weighted Scoring Engine
 * Relevant starter snippet: System.out.println("Lowest Evaluation scores: " + findLowestEvaluationScores(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestEvaluationScores(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied evaluation scores array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external l
 * Expected sample output:
 * Lowest Evaluation scores: 4
 */
/* Correction: implemented findLowestEvaluationScores as required by the issue; the starter omitted this method. */
public class Issue62_VH26_ProjectEvaluationAndWeightedScoringEngine {
    public static void main(String[] args) {
        System.out.println("Lowest Evaluation scores: " + findLowestEvaluationScores(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestEvaluationScores(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestEvaluationScores.
    static int findLowestEvaluationScores(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
