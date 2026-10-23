/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findHighestPaidWorkDays` for Payroll with Attendance and Leave Integration
 * Relevant starter snippet: System.out.println("Highest Paid work days: " + findHighestPaidWorkDays(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestPaidWorkDays(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied paid work days array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external librarie
 * Expected sample output:
 * Highest Paid work days: 18
 */
/* Correction: implemented findHighestPaidWorkDays as required by the issue; the starter omitted this method. */
public class Issue60_VH09_PayrollWithAttendanceAndLeaveIntegration {
    public static void main(String[] args) {
        System.out.println("Highest Paid work days: " + findHighestPaidWorkDays(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestPaidWorkDays(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestPaidWorkDays.
    static int findHighestPaidWorkDays(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
