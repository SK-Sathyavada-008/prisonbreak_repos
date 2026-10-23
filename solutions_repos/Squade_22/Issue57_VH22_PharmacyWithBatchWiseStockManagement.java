/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `containsMedicineName` for Pharmacy with Batch-wise Stock Management
 * Relevant starter snippet: System.out.println("Medicine name found: " + containsMedicineName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsMedicineName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested medicine name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Medicine name found: true
 */
/* Correction: implemented containsMedicineName as required by the issue; the starter omitted this method. */
public class Issue57_VH22_PharmacyWithBatchWiseStockManagement {
    public static void main(String[] args) {
        System.out.println("Medicine name found: " + containsMedicineName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsMedicineName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsMedicineName.
    static boolean containsMedicineName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
