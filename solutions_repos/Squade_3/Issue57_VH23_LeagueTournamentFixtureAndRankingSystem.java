/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `findLowestTeamPoints` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Lowest Team points: " + findLowestTeamPoints(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestTeamPoints(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied team points array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Lowest Team points: 4
 */
/* Correction: implemented findLowestTeamPoints as required by the issue; the starter omitted this method. */
public class Issue57_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Lowest Team points: " + findLowestTeamPoints(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestTeamPoints(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestTeamPoints.
    static int findLowestTeamPoints(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
