/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculatePlayerScore` for Configurable Tic-Tac-Toe Tournament Engine
 * Relevant starter snippet: System.out.println("Total Player score: " + calculatePlayerScore(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculatePlayerScore(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit player score and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance,
 * Expected sample output:
 * Total Player score: 75
 */
/* Correction: implemented calculatePlayerScore as required by the issue; the starter omitted this method. */
public class Issue59_VH32_ConfigurableTicTacToeTournamentEngine {
    public static void main(String[] args) {
        System.out.println("Total Player score: " + calculatePlayerScore(25, 3));
    }

    // Required method signature: static int calculatePlayerScore(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculatePlayerScore.
    static int calculatePlayerScore(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
