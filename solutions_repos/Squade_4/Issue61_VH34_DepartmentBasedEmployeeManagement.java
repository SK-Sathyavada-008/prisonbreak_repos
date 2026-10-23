/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `containsDepartmentName` for Department-Based Employee Management
 * Relevant starter snippet: System.out.println("Department name found: " + containsDepartmentName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsDepartmentName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested department name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do
 * Expected sample output:
 * Department name found: true
 */
/* Correction: implemented containsDepartmentName as required by the issue; the starter omitted this method. */
public class Issue61_VH34_DepartmentBasedEmployeeManagement {
    public static void main(String[] args) {
        System.out.println("Department name found: " + containsDepartmentName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsDepartmentName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsDepartmentName.
    static boolean containsDepartmentName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
