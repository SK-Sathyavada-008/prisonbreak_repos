/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `containsWardName` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Ward name found: " + containsWardName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsWardName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested ward name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use col
 * Expected sample output:
 * Ward name found: true
 */
/* Correction: implemented containsWardName as required by the issue; the starter omitted this method. */
public class Issue61_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Ward name found: " + containsWardName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsWardName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsWardName.
    static boolean containsWardName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
