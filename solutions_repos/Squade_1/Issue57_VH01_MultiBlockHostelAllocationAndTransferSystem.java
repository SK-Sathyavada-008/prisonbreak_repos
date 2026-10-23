/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `countAvailableRoomCapacity` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Available Room capacity: " + countAvailableRoomCapacity(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableRoomCapacity(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available room capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritan
 * Expected sample output:
 * Available Room capacity: 3
 */
/* Correction: implemented countAvailableRoomCapacity as required by the issue; the starter omitted this method. */
public class Issue57_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Available Room capacity: " + countAvailableRoomCapacity(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableRoomCapacity(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableRoomCapacity.
    static int countAvailableRoomCapacity(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
