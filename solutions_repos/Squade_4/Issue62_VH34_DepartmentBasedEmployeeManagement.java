/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateDiscountedSalaryAmount` for Department-Based Employee Management
 * Relevant starter snippet: System.out.println("Discounted Salary amount: " + calculateDiscountedSalaryAmount(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedSalaryAmount(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, in
 * Expected sample output:
 * Discounted Salary amount: 180.0
 */
/* Correction: implemented calculateDiscountedSalaryAmount as required by the issue; the starter omitted this method. */
public class Issue62_VH34_DepartmentBasedEmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Discounted Salary amount: " + calculateDiscountedSalaryAmount(200, 10));
    }

    // Required method signature: static double calculateDiscountedSalaryAmount(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedSalaryAmount.
    static double calculateDiscountedSalaryAmount(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
