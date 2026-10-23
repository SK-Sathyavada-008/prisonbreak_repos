/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `containsLabName` for Computer Lab Equipment and Allocation System
 * Relevant starter snippet: System.out.println("Lab name found: " + containsLabName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsLabName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested lab name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use colle
 * Expected sample output:
 * Lab name found: true
 */
/* Correction: implemented containsLabName as required by the issue; the starter omitted this method. */
public class Issue59_VH21_ComputerLabEquipmentAndAllocationSystem {
    public static void main(String[] args) {
        System.out.println("Lab name found: " + containsLabName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsLabName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsLabName.
    static boolean containsLabName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
