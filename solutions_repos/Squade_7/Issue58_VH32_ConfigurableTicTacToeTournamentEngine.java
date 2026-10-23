/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findGameRecordIndex` for Configurable Tic-Tac-Toe Tournament Engine
 * Relevant starter snippet: System.out.println("Game record index: " + findGameRecordIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findGameRecordIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested game record ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collec
 * Expected sample output:
 * Game record index: 2
 */
/* Correction: implemented findGameRecordIndex as required by the issue; the starter omitted this method. */
public class Issue58_VH32_ConfigurableTicTacToeTournamentEngine {
    public static void main(String[] args) {
        System.out.println("Game record index: " + findGameRecordIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findGameRecordIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findGameRecordIndex.
    static int findGameRecordIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
