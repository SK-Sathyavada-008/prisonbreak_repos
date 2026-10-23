/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `isValidRegisterRequest` for Election System with Constituencies and Recount
 * Relevant starter snippet: System.out.println("Register request valid: " + isValidRegisterRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidRegisterRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Register request valid: true
 */
/* Correction: implemented isValidRegisterRequest as required by the issue; the starter omitted this method. */
public class Issue63_VH13_ElectionSystemWithConstituenciesAndRecount {
    public static void main(String[] args) {
        System.out.println("Register request valid: " + isValidRegisterRequest(2, 5));
    }

    // Required method signature: static boolean isValidRegisterRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidRegisterRequest.
    static boolean isValidRegisterRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
