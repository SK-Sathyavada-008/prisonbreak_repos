/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateRemainingMovesPercentage` for Configurable Tic-Tac-Toe Tournament Engine
 * Relevant starter snippet: System.out.println("Remaining moves percentage: " + calculateRemainingMovesPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateRemainingMovesPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic J
 * Expected sample output:
 * Remaining moves percentage: 75.0
 */
/* Correction: implemented calculateRemainingMovesPercentage as required by the issue; the starter omitted this method. */
public class Issue62_VH32_ConfigurableTicTacToeTournamentEngine {
    public static void main(String[] args) {
        System.out.println("Remaining moves percentage: " + calculateRemainingMovesPercentage(3, 4));
    }

    // Required method signature: static double calculateRemainingMovesPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingMovesPercentage.
    static double calculateRemainingMovesPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
