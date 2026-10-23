/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `countAvailableOvertimeLimit` for Payroll with Attendance and Leave Integration
 * Relevant starter snippet: System.out.println("Available Overtime limit: " + countAvailableOvertimeLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableOvertimeLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available overtime limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Overtime limit: 3
 */
/* Correction: implemented countAvailableOvertimeLimit as required by the issue; the starter omitted this method. */
public class Issue57_VH09_PayrollWithAttendanceAndLeaveIntegration {
    public static void main(String[] args) {
        System.out.println("Available Overtime limit: " + countAvailableOvertimeLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableOvertimeLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableOvertimeLimit.
    static int countAvailableOvertimeLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
