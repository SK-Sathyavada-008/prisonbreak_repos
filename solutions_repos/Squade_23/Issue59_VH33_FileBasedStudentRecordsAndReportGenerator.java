/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `isValidSaveRequest` for File-Based Student Records and Report Generator
 * Relevant starter snippet: System.out.println("Save request valid: " + isValidSaveRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidSaveRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use
 * Expected sample output:
 * Save request valid: true
 */
/* Correction: implemented isValidSaveRequest as required by the issue; the starter omitted this method. */
public class Issue59_VH33_FileBasedStudentRecordsAndReportGenerator {
    public static void main(String[] args) {
        System.out.println("Save request valid: " + isValidSaveRequest(2, 5));
    }

    // Required method signature: static boolean isValidSaveRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidSaveRequest.
    static boolean isValidSaveRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
