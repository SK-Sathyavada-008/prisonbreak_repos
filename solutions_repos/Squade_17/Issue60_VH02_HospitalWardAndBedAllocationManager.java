/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateRemainingBedCapacity` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Remaining Bed capacity: " + calculateRemainingBedCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingBedCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many bed capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs
 * Expected sample output:
 * Remaining Bed capacity: 5
 */
/* Correction: implemented calculateRemainingBedCapacity as required by the issue; the starter omitted this method. */
public class Issue60_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Remaining Bed capacity: " + calculateRemainingBedCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingBedCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingBedCapacity.
    static int calculateRemainingBedCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
