/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateRemainingPointsThreshold` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Remaining Points threshold: " + calculateRemainingPointsThreshold(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingPointsThreshold(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many points threshold remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java co
 * Expected sample output:
 * Remaining Points threshold: 5
 */
/* Correction: implemented calculateRemainingPointsThreshold as required by the issue; the starter omitted this method. */
public class Issue61_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Remaining Points threshold: " + calculateRemainingPointsThreshold(12, 7));
    }

    // Required method signature: static int calculateRemainingPointsThreshold(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingPointsThreshold.
    static int calculateRemainingPointsThreshold(int capacity, int occupied) {
        return capacity - occupied;
    }
}
