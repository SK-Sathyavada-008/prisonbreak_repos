/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `countAvailablePassingScore` for Project Evaluation and Weighted Scoring Engine
 * Relevant starter snippet: System.out.println("Available Passing score: " + countAvailablePassingScore(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailablePassingScore(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available passing score. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritan
 * Expected sample output:
 * Available Passing score: 3
 */
/* Correction: implemented countAvailablePassingScore as required by the issue; the starter omitted this method. */
public class Issue64_VH26_ProjectEvaluationAndWeightedScoringEngine {
    public static void main(String[] args) {
        System.out.println("Available Passing score: " + countAvailablePassingScore(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailablePassingScore(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailablePassingScore.
    static int countAvailablePassingScore(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
