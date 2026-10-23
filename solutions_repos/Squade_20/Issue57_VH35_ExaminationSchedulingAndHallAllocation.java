/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateRemainingHallCapacity` for Examination Scheduling and Hall Allocation
 * Relevant starter snippet: System.out.println("Remaining Hall capacity: " + calculateRemainingHallCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingHallCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many hall capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java construc
 * Expected sample output:
 * Remaining Hall capacity: 5
 */
/* Correction: implemented calculateRemainingHallCapacity as required by the issue; the starter omitted this method. */
public class Issue57_VH35_ExaminationSchedulingAndHallAllocation {
    public static void main(String[] args) {
        System.out.println("Remaining Hall capacity: " + calculateRemainingHallCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingHallCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingHallCapacity.
    static int calculateRemainingHallCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
