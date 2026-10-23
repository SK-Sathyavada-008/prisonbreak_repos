/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateExamFee` for Examination Scheduling and Hall Allocation
 * Relevant starter snippet: System.out.println("Total Exam fee: " + calculateExamFee(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateExamFee(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit exam fee and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or exte
 * Expected sample output:
 * Total Exam fee: 75
 */
/* Correction: implemented calculateExamFee as required by the issue; the starter omitted this method. */
public class Issue64_VH35_ExaminationSchedulingAndHallAllocation {
    public static void main(String[] args) {
        System.out.println("Total Exam fee: " + calculateExamFee(25, 3));
    }

    // Required method signature: static int calculateExamFee(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateExamFee.
    static int calculateExamFee(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
