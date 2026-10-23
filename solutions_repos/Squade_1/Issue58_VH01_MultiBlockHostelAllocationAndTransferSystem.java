/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `findHostelStudentIndex` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Hostel student index: " + findHostelStudentIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findHostelStudentIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested hostel student ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use 
 * Expected sample output:
 * Hostel student index: 2
 */
/* Correction: implemented findHostelStudentIndex as required by the issue; the starter omitted this method. */
public class Issue58_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Hostel student index: " + findHostelStudentIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findHostelStudentIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHostelStudentIndex.
    static int findHostelStudentIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
