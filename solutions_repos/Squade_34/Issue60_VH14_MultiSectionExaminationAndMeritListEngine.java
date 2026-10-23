/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `countAvailableSectionCutoff` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Available Section cutoff: " + countAvailableSectionCutoff(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableSectionCutoff(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available section cutoff. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Section cutoff: 3
 */
/* Correction: implemented countAvailableSectionCutoff as required by the issue; the starter omitted this method. */
public class Issue60_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Available Section cutoff: " + countAvailableSectionCutoff(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableSectionCutoff(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableSectionCutoff.
    static int countAvailableSectionCutoff(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
