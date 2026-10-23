/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `containsStudentName` for File-Based Student Records and Report Generator
 * Relevant starter snippet: System.out.println("Student name found: " + containsStudentName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsStudentName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested student name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not u
 * Expected sample output:
 * Student name found: true
 */
/* Correction: implemented containsStudentName as required by the issue; the starter omitted this method. */
public class Issue63_VH33_FileBasedStudentRecordsAndReportGenerator {
    public static void main(String[] args) {
        System.out.println("Student name found: " + containsStudentName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsStudentName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsStudentName.
    static boolean containsStudentName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
