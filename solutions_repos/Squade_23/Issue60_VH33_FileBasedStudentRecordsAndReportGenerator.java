/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findHighestStudentMarks` for File-Based Student Records and Report Generator
 * Relevant starter snippet: System.out.println("Highest Student marks: " + findHighestStudentMarks(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestStudentMarks(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied student marks array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries
 * Expected sample output:
 * Highest Student marks: 18
 */
/* Correction: implemented findHighestStudentMarks as required by the issue; the starter omitted this method. */
public class Issue60_VH33_FileBasedStudentRecordsAndReportGenerator {
    public static void main(String[] args) {
        System.out.println("Highest Student marks: " + findHighestStudentMarks(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestStudentMarks(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestStudentMarks.
    static int findHighestStudentMarks(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
