/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateRemainingPassingScore` for Project Evaluation and Weighted Scoring Engine
 * Relevant starter snippet: System.out.println("Remaining Passing score: " + calculateRemainingPassingScore(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingPassingScore(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many passing score remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java construc
 * Expected sample output:
 * Remaining Passing score: 5
 */
/* Correction: implemented calculateRemainingPassingScore as required by the issue; the starter omitted this method. */
public class Issue58_VH26_ProjectEvaluationAndWeightedScoringEngine {
    public static void main(String[] args) {
        System.out.println("Remaining Passing score: " + calculateRemainingPassingScore(12, 7));
    }

    // Required method signature: static int calculateRemainingPassingScore(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingPassingScore.
    static int calculateRemainingPassingScore(int capacity, int occupied) {
        return capacity - occupied;
    }
}
