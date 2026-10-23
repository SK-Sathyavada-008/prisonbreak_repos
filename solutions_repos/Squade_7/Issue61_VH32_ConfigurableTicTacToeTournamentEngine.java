/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateRemainingBoardSize` for Configurable Tic-Tac-Toe Tournament Engine
 * Relevant starter snippet: System.out.println("Remaining Board size: " + calculateRemainingBoardSize(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingBoardSize(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many board size remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do
 * Expected sample output:
 * Remaining Board size: 5
 */
/* Correction: implemented calculateRemainingBoardSize as required by the issue; the starter omitted this method. */
public class Issue61_VH32_ConfigurableTicTacToeTournamentEngine {
    public static void main(String[] args) {
        System.out.println("Remaining Board size: " + calculateRemainingBoardSize(12, 7));
    }

    // Required method signature: static int calculateRemainingBoardSize(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingBoardSize.
    static int calculateRemainingBoardSize(int capacity, int occupied) {
        return capacity - occupied;
    }
}
