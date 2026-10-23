/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `isValidEvaluateRequest` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Evaluate request valid: " + isValidEvaluateRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidEvaluateRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Evaluate request valid: true
 */
/* Correction: implemented isValidEvaluateRequest as required by the issue; the starter omitted this method. */
public class Issue62_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Evaluate request valid: " + isValidEvaluateRequest(2, 5));
    }

    // Required method signature: static boolean isValidEvaluateRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidEvaluateRequest.
    static boolean isValidEvaluateRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
