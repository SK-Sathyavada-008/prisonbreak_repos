/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateDiscountedExamScore` for Multi-Section Examination and Merit List Engine
 * Relevant starter snippet: System.out.println("Discounted Exam score: " + calculateDiscountedExamScore(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedExamScore(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inher
 * Expected sample output:
 * Discounted Exam score: 180.0
 */
/* Correction: implemented calculateDiscountedExamScore as required by the issue; the starter omitted this method. */
public class Issue58_VH14_MultiSectionExaminationAndMeritListEngine {
    public static void main(String[] args) {
        System.out.println("Discounted Exam score: " + calculateDiscountedExamScore(200, 10));
    }

    // Required method signature: static double calculateDiscountedExamScore(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedExamScore.
    static double calculateDiscountedExamScore(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
