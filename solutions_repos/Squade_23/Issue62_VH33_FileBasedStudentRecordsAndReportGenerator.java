/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `countAtLeastStudentMarks` for File-Based Student Records and Report Generator
 * Relevant starter snippet: System.out.println("Values meeting threshold: " + countAtLeastStudentMarks(new int[] {2, 5, 1, 7}, 4));
 * Corrected solution snippet: for (int value : values) if (value >= threshold) count++;
 * Explanation: The starter calls `countAtLeastStudentMarks(int[] values, int threshold)`, but the method has not been written. Write this method from scratch. Count how many supplied student marks values are at least the given threshold. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, i
 * Expected sample output:
 * Values meeting threshold: 2
 */
/* Correction: implemented countAtLeastStudentMarks as required by the issue; the starter omitted this method. */
public class Issue62_VH33_FileBasedStudentRecordsAndReportGenerator {
    public static void main(String[] args) {
        System.out.println("Values meeting threshold: " + countAtLeastStudentMarks(new int[] {2, 5, 1, 7}, 4));
    }

    // Required method signature: static int countAtLeastStudentMarks(int[] values, int threshold)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAtLeastStudentMarks.
    static int countAtLeastStudentMarks(int[] values, int threshold) {
        int count = 0;
        for (int value : values) if (value >= threshold) count++;
        return count;
    }
}
