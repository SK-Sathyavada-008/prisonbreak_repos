/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `isValidAssignRequest` for Department-Based Employee Management
 * Relevant starter snippet: System.out.println("Assign request valid: " + isValidAssignRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidAssignRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not u
 * Expected sample output:
 * Assign request valid: true
 */
/* Correction: implemented isValidAssignRequest as required by the issue; the starter omitted this method. */
public class Issue58_VH34_DepartmentBasedEmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Assign request valid: " + isValidAssignRequest(2, 5));
    }

    // Required method signature: static boolean isValidAssignRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidAssignRequest.
    static boolean isValidAssignRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
