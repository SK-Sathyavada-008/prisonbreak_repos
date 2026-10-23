/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `findHighestSectionMarks` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Highest Section marks: " + findHighestSectionMarks(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestSectionMarks(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied section marks array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries
 * Expected sample output:
 * Highest Section marks: 18
 */
/* Correction: implemented findHighestSectionMarks as required by the issue; the starter omitted this method. */
public class Issue63_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Highest Section marks: " + findHighestSectionMarks(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestSectionMarks(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestSectionMarks.
    static int findHighestSectionMarks(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
