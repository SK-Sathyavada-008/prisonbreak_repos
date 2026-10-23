/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateMatchPoints` for League Tournament Fixture and Ranking System
 * Relevant starter snippet: System.out.println("Total Match points: " + calculateMatchPoints(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateMatchPoints(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit match points and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance,
 * Expected sample output:
 * Total Match points: 75
 */
/* Correction: implemented calculateMatchPoints as required by the issue; the starter omitted this method. */
public class Issue60_VH23_LeagueTournamentFixtureAndRankingSystem {
    public static void main(String[] args) {
        System.out.println("Total Match points: " + calculateMatchPoints(25, 3));
    }

    // Required method signature: static int calculateMatchPoints(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateMatchPoints.
    static int calculateMatchPoints(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
