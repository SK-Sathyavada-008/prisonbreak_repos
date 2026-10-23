/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `countAtLeastQuizScores` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Values meeting threshold: " + countAtLeastQuizScores(new int[] {2, 5, 1, 7}, 4));
 * Corrected solution snippet: for (int value : values) if (value >= threshold) count++;
 * Explanation: The starter calls `countAtLeastQuizScores(int[] values, int threshold)`, but the method has not been written. Write this method from scratch. Count how many supplied quiz scores values are at least the given threshold. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Values meeting threshold: 2
 */
/* Correction: implemented countAtLeastQuizScores as required by the issue; the starter omitted this method. */
public class Issue57_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Values meeting threshold: " + countAtLeastQuizScores(new int[] {2, 5, 1, 7}, 4));
    }

    // Required method signature: static int countAtLeastQuizScores(int[] values, int threshold)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAtLeastQuizScores.
    static int countAtLeastQuizScores(int[] values, int threshold) {
        int count = 0;
        for (int value : values) if (value >= threshold) count++;
        return count;
    }
}
