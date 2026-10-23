/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `isValidAdmitRequest` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Admit request valid: " + isValidAdmitRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidAdmitRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not us
 * Expected sample output:
 * Admit request valid: true
 */
/* Correction: implemented isValidAdmitRequest as required by the issue; the starter omitted this method. */
public class Issue59_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Admit request valid: " + isValidAdmitRequest(2, 5));
    }

    // Required method signature: static boolean isValidAdmitRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidAdmitRequest.
    static boolean isValidAdmitRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
