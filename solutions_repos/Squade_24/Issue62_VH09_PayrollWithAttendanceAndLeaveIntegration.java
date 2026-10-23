/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `containsEmployeeName` for Payroll with Attendance and Leave Integration
 * Relevant starter snippet: System.out.println("Employee name found: " + containsEmployeeName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsEmployeeName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested employee name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Employee name found: true
 */
/* Correction: implemented containsEmployeeName as required by the issue; the starter omitted this method. */
public class Issue62_VH09_PayrollWithAttendanceAndLeaveIntegration {
    public static void main(String[] args) {
        System.out.println("Employee name found: " + containsEmployeeName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsEmployeeName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsEmployeeName.
    static boolean containsEmployeeName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
