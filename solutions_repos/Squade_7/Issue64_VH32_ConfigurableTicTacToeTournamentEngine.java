/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateDiscountedPlayerScore` for Configurable Tic-Tac-Toe Tournament Engine
 * Relevant starter snippet: System.out.println("Discounted Player score: " + calculateDiscountedPlayerScore(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedPlayerScore(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inh
 * Expected sample output:
 * Discounted Player score: 180.0
 */
/* Correction: implemented calculateDiscountedPlayerScore as required by the issue; the starter omitted this method. */
public class Issue64_VH32_ConfigurableTicTacToeTournamentEngine {
    public static void main(String[] args) {
        System.out.println("Discounted Player score: " + calculateDiscountedPlayerScore(200, 10));
    }

    // Required method signature: static double calculateDiscountedPlayerScore(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedPlayerScore.
    static double calculateDiscountedPlayerScore(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
