/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateTotalSectionMarks` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Total Section marks: " + calculateTotalSectionMarks(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalSectionMarks(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied section marks. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Section marks: 13
 */
/* Correction: implemented calculateTotalSectionMarks as required by the issue; the starter omitted this method. */
public class Issue59_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Total Section marks: " + calculateTotalSectionMarks(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalSectionMarks(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalSectionMarks.
    static int calculateTotalSectionMarks(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
