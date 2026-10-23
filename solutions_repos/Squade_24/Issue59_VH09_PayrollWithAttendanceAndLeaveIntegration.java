/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateDailyWage` for Payroll with Attendance and Leave Integration
 * Relevant starter snippet: System.out.println("Total Daily wage: " + calculateDailyWage(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateDailyWage(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit daily wage and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or 
 * Expected sample output:
 * Total Daily wage: 75
 */
/* Correction: implemented calculateDailyWage as required by the issue; the starter omitted this method. */
public class Issue59_VH09_PayrollWithAttendanceAndLeaveIntegration {
    public static void main(String[] args) {
        System.out.println("Total Daily wage: " + calculateDailyWage(25, 3));
    }

    // Required method signature: static int calculateDailyWage(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDailyWage.
    static int calculateDailyWage(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
