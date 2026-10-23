/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateDiscountedDailyWage` for Payroll with Attendance and Leave Integration
 * Relevant starter snippet: System.out.println("Discounted Daily wage: " + calculateDiscountedDailyWage(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedDailyWage(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Discounted Daily wage: 180.0
 */
/* Correction: implemented calculateDiscountedDailyWage as required by the issue; the starter omitted this method. */
public class Issue63_VH09_PayrollWithAttendanceAndLeaveIntegration {
    public static void main(String[] args) {
        System.out.println("Discounted Daily wage: " + calculateDiscountedDailyWage(200, 10));
    }

    // Required method signature: static double calculateDiscountedDailyWage(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedDailyWage.
    static double calculateDiscountedDailyWage(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
