/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findEmployeeIndex` for Payroll with Attendance and Leave Integration
 * Relevant starter snippet: System.out.println("Employee index: " + findEmployeeIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findEmployeeIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested employee ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections
 * Expected sample output:
 * Employee index: 2
 */
/* Correction: implemented findEmployeeIndex as required by the issue; the starter omitted this method. */
public class Issue58_VH09_PayrollWithAttendanceAndLeaveIntegration {
    public static void main(String[] args) {
        System.out.println("Employee index: " + findEmployeeIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findEmployeeIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findEmployeeIndex.
    static int findEmployeeIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
