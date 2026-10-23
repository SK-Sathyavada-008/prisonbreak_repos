/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateTotalAvailableComputers` for Computer Lab Equipment and Allocation System
 * Relevant starter snippet: System.out.println("Total Available computers: " + calculateTotalAvailableComputers(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableComputers(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available computers. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external librari
 * Expected sample output:
 * Total Available computers: 13
 */
/* Correction: implemented calculateTotalAvailableComputers as required by the issue; the starter omitted this method. */
public class Issue60_VH21_ComputerLabEquipmentAndAllocationSystem {
    public static void main(String[] args) {
        System.out.println("Total Available computers: " + calculateTotalAvailableComputers(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableComputers(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableComputers.
    static int calculateTotalAvailableComputers(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
