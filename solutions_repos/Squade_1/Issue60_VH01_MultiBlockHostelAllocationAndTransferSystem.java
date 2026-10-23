/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `isValidAllocateRequest` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Allocate request valid: " + isValidAllocateRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidAllocateRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Allocate request valid: true
 */
/* Correction: implemented isValidAllocateRequest as required by the issue; the starter omitted this method. */
public class Issue60_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Allocate request valid: " + isValidAllocateRequest(2, 5));
    }

    // Required method signature: static boolean isValidAllocateRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidAllocateRequest.
    static boolean isValidAllocateRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
