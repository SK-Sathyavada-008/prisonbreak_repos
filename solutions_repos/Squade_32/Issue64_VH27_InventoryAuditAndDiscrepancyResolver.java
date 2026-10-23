/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `isValidAuditRequest` for Inventory Audit and Discrepancy Resolver
 * Relevant starter snippet: System.out.println("Audit request valid: " + isValidAuditRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidAuditRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not us
 * Expected sample output:
 * Audit request valid: true
 */
/* Correction: implemented isValidAuditRequest as required by the issue; the starter omitted this method. */
public class Issue64_VH27_InventoryAuditAndDiscrepancyResolver {
    public static void main(String[] args) {
        System.out.println("Audit request valid: " + isValidAuditRequest(2, 5));
    }

    // Required method signature: static boolean isValidAuditRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidAuditRequest.
    static boolean isValidAuditRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
