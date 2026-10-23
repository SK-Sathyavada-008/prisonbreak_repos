/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `findHighestTeamPoints` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Highest Team points: " + findHighestTeamPoints(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestTeamPoints(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied team points array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Highest Team points: 18
 */
/* Correction: implemented findHighestTeamPoints as required by the issue; the starter omitted this method. */
public class Issue62_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Highest Team points: " + findHighestTeamPoints(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestTeamPoints(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestTeamPoints.
    static int findHighestTeamPoints(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
