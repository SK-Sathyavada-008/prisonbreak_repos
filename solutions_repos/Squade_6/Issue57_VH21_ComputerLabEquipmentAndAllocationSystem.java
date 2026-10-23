/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateAvailableComputersPercentage` for Computer Lab Equipment and Allocation System
 * Relevant starter snippet: System.out.println("Available computers percentage: " + calculateAvailableComputersPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateAvailableComputersPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to bas
 * Expected sample output:
 * Available computers percentage: 75.0
 */
/* Correction: implemented calculateAvailableComputersPercentage as required by the issue; the starter omitted this method. */
public class Issue57_VH21_ComputerLabEquipmentAndAllocationSystem {
    public static void main(String[] args) {
        System.out.println("Available computers percentage: " + calculateAvailableComputersPercentage(3, 4));
    }

    // Required method signature: static double calculateAvailableComputersPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateAvailableComputersPercentage.
    static double calculateAvailableComputersPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
