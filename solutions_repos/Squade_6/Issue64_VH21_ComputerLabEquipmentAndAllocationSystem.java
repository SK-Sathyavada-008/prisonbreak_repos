/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `findHighestAvailableComputers` for Computer Lab Equipment and Allocation System
 * Relevant starter snippet: System.out.println("Highest Available computers: " + findHighestAvailableComputers(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableComputers(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available computers array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or extern
 * Expected sample output:
 * Highest Available computers: 18
 */
/* Correction: implemented findHighestAvailableComputers as required by the issue; the starter omitted this method. */
public class Issue64_VH21_ComputerLabEquipmentAndAllocationSystem {
    public static void main(String[] args) {
        System.out.println("Highest Available computers: " + findHighestAvailableComputers(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableComputers(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableComputers.
    static int findHighestAvailableComputers(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
