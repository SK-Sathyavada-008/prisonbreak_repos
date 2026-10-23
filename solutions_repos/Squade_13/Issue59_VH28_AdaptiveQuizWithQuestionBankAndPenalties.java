/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `containsQuestionCategory` for Adaptive Quiz with Question Bank and Penalties
 * Relevant starter snippet: System.out.println("Question category found: " + containsQuestionCategory(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsQuestionCategory(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested question category text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs
 * Expected sample output:
 * Question category found: true
 */
/* Correction: implemented containsQuestionCategory as required by the issue; the starter omitted this method. */
public class Issue59_VH28_AdaptiveQuizWithQuestionBankAndPenalties {
    public static void main(String[] args) {
        System.out.println("Question category found: " + containsQuestionCategory(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsQuestionCategory(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsQuestionCategory.
    static boolean containsQuestionCategory(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
