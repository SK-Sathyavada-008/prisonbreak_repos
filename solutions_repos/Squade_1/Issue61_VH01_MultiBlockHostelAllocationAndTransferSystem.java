/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateRemainingRoomCapacity` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Remaining Room capacity: " + calculateRemainingRoomCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingRoomCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many room capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java construc
 * Expected sample output:
 * Remaining Room capacity: 5
 */
/* Correction: implemented calculateRemainingRoomCapacity as required by the issue; the starter omitted this method. */
public class Issue61_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Remaining Room capacity: " + calculateRemainingRoomCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingRoomCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingRoomCapacity.
    static int calculateRemainingRoomCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
