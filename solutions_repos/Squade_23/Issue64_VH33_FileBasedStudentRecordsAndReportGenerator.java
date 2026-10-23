/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateTotalStudentMarks` for File-Based Student Records and Report Generator
 * Relevant starter snippet: System.out.println("Total Student marks: " + calculateTotalStudentMarks(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalStudentMarks(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied student marks. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Student marks: 13
 */
/* Correction: implemented calculateTotalStudentMarks as required by the issue; the starter omitted this method. */
public class Issue64_VH33_FileBasedStudentRecordsAndReportGenerator {
    public static void main(String[] args) {
        System.out.println("Total Student marks: " + calculateTotalStudentMarks(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalStudentMarks(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalStudentMarks.
    static int calculateTotalStudentMarks(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
