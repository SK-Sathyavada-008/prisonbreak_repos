/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `isValidMakeMoveRequest` for Configurable Tic-Tac-Toe Tournament Engine
 * Relevant starter snippet: System.out.println("Make move request valid: " + isValidMakeMoveRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidMakeMoveRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Make move request valid: true
 */
/* Correction: implemented isValidMakeMoveRequest as required by the issue; the starter omitted this method. */
public class Issue60_VH32_ConfigurableTicTacToeTournamentEngine {
    public static void main(String[] args) {
        System.out.println("Make move request valid: " + isValidMakeMoveRequest(2, 5));
    }

    // Required method signature: static boolean isValidMakeMoveRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidMakeMoveRequest.
    static boolean isValidMakeMoveRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
