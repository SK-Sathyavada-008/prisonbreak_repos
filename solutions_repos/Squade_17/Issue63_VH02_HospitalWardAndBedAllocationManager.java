/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateTotalAvailableBeds` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Total Available beds: " + calculateTotalAvailableBeds(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableBeds(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available beds. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Available beds: 13
 */
/* Correction: implemented calculateTotalAvailableBeds as required by the issue; the starter omitted this method. */
public class Issue63_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Total Available beds: " + calculateTotalAvailableBeds(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableBeds(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableBeds.
    static int calculateTotalAvailableBeds(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
