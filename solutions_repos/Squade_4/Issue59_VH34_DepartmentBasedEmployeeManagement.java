/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `findHighestDepartmentVacancies` for Department-Based Employee Management
 * Relevant starter snippet: System.out.println("Highest Department vacancies: " + findHighestDepartmentVacancies(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestDepartmentVacancies(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied department vacancies array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or exte
 * Expected sample output:
 * Highest Department vacancies: 18
 */
/* Correction: implemented findHighestDepartmentVacancies as required by the issue; the starter omitted this method. */
public class Issue59_VH34_DepartmentBasedEmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Highest Department vacancies: " + findHighestDepartmentVacancies(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestDepartmentVacancies(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestDepartmentVacancies.
    static int findHighestDepartmentVacancies(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
