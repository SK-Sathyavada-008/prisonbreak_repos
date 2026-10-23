/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `countAvailablePointsThreshold` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Available Points threshold: " + countAvailablePointsThreshold(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailablePointsThreshold(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available points threshold. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inh
 * Expected sample output:
 * Available Points threshold: 3
 */
/* Correction: implemented countAvailablePointsThreshold as required by the issue; the starter omitted this method. */
public class Issue59_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Available Points threshold: " + countAvailablePointsThreshold(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailablePointsThreshold(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailablePointsThreshold.
    static int countAvailablePointsThreshold(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
