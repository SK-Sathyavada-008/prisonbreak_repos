/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateTotalDepartmentVacancies` for Department-Based Employee Management
 * Relevant starter snippet: System.out.println("Total Department vacancies: " + calculateTotalDepartmentVacancies(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalDepartmentVacancies(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied department vacancies. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Total Department vacancies: 13
 */
/* Correction: implemented calculateTotalDepartmentVacancies as required by the issue; the starter omitted this method. */
public class Issue63_VH34_DepartmentBasedEmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Total Department vacancies: " + calculateTotalDepartmentVacancies(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalDepartmentVacancies(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalDepartmentVacancies.
    static int calculateTotalDepartmentVacancies(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
