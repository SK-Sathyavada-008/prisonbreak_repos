/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateScholarshipAmount` for Scholarship Eligibility and Allocation Engine
 * Relevant starter snippet: System.out.println("Total Scholarship amount: " + calculateScholarshipAmount(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateScholarshipAmount(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit scholarship amount and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, 
 * Expected sample output:
 * Total Scholarship amount: 75
 */
/* Correction: implemented calculateScholarshipAmount as required by the issue; the starter omitted this method. */
public class Issue59_VH24_ScholarshipEligibilityAndAllocationEngine {
    public static void main(String[] args) {
        System.out.println("Total Scholarship amount: " + calculateScholarshipAmount(25, 3));
    }

    // Required method signature: static int calculateScholarshipAmount(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateScholarshipAmount.
    static int calculateScholarshipAmount(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
