/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateTeamPointsPercentage` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Team points percentage: " + calculateTeamPointsPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateTeamPointsPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java 
 * Expected sample output:
 * Team points percentage: 75.0
 */
/* Correction: implemented calculateTeamPointsPercentage as required by the issue; the starter omitted this method. */
public class Issue63_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Team points percentage: " + calculateTeamPointsPercentage(3, 4));
    }

    // Required method signature: static double calculateTeamPointsPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTeamPointsPercentage.
    static double calculateTeamPointsPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
