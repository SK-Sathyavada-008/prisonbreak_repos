/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateEvaluationScoresPercentage` for Project Evaluation and Weighted Scoring Engine
 * Relevant starter snippet: System.out.println("Evaluation scores percentage: " + calculateEvaluationScoresPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateEvaluationScoresPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic
 * Expected sample output:
 * Evaluation scores percentage: 75.0
 */
/* Correction: implemented calculateEvaluationScoresPercentage as required by the issue; the starter omitted this method. */
public class Issue60_VH26_ProjectEvaluationAndWeightedScoringEngine {
    public static void main(String[] args) {
        System.out.println("Evaluation scores percentage: " + calculateEvaluationScoresPercentage(3, 4));
    }

    // Required method signature: static double calculateEvaluationScoresPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateEvaluationScoresPercentage.
    static double calculateEvaluationScoresPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
