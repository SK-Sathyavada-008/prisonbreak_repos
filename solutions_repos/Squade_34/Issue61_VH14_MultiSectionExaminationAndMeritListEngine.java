/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `findExamCandidateIndex` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Exam candidate index: " + findExamCandidateIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findExamCandidateIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested exam candidate ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use 
 * Expected sample output:
 * Exam candidate index: 2
 */
/* Correction: implemented findExamCandidateIndex as required by the issue; the starter omitted this method. */
public class Issue61_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Exam candidate index: " + findExamCandidateIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findExamCandidateIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findExamCandidateIndex.
    static int findExamCandidateIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
