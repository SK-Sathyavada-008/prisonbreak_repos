/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateTotalQuizScores` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Total Quiz scores: " + calculateTotalQuizScores(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalQuizScores(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied quiz scores. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Quiz scores: 13
 */
/* Correction: implemented calculateTotalQuizScores as required by the issue; the starter omitted this method. */
public class Issue61_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Total Quiz scores: " + calculateTotalQuizScores(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalQuizScores(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalQuizScores.
    static int calculateTotalQuizScores(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
