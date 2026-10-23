/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateSalaryAmount` for Department-Based Employee Management
 * Relevant starter snippet: System.out.println("Total Salary amount: " + calculateSalaryAmount(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateSalaryAmount(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit salary amount and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritanc
 * Expected sample output:
 * Total Salary amount: 75
 */
/* Correction: implemented calculateSalaryAmount as required by the issue; the starter omitted this method. */
public class Issue57_VH34_DepartmentBasedEmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Total Salary amount: " + calculateSalaryAmount(25, 3));
    }

    // Required method signature: static int calculateSalaryAmount(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateSalaryAmount.
    static int calculateSalaryAmount(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
