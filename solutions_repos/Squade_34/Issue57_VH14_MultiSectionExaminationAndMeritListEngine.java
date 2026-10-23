/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `containsCandidateName` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Candidate name found: " + containsCandidateName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsCandidateName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested candidate name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do n
 * Expected sample output:
 * Candidate name found: true
 */
/* Correction: implemented containsCandidateName as required by the issue; the starter omitted this method. */
public class Issue57_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Candidate name found: " + containsCandidateName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsCandidateName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsCandidateName.
    static boolean containsCandidateName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
