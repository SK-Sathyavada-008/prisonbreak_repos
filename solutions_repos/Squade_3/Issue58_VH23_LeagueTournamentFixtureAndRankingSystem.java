/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateTotalTeamPoints` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Total Team points: " + calculateTotalTeamPoints(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalTeamPoints(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied team points. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Team points: 13
 */
/* Correction: implemented calculateTotalTeamPoints as required by the issue; the starter omitted this method. */
public class Issue58_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Total Team points: " + calculateTotalTeamPoints(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalTeamPoints(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalTeamPoints.
    static int calculateTotalTeamPoints(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
