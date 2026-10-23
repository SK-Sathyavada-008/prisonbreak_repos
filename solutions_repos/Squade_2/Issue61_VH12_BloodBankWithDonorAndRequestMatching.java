/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateTotalAvailableUnits` for Blood Bank with Donor and Request Matching
 * Relevant starter snippet: System.out.println("Total Available units: " + calculateTotalAvailableUnits(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableUnits(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available units. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Available units: 13
 */
/* Correction: implemented calculateTotalAvailableUnits as required by the issue; the starter omitted this method. */
public class Issue61_VH12_BloodBankWithDonorAndRequestMatching {
    public static void main(String[] args) {
        System.out.println("Total Available units: " + calculateTotalAvailableUnits(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableUnits(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableUnits.
    static int calculateTotalAvailableUnits(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
