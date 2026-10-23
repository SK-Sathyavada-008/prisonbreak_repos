/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateWardCharge` for Hospital Ward and Bed Allocation Manager
 * Relevant starter snippet: System.out.println("Total Ward charge: " + calculateWardCharge(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateWardCharge(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit ward charge and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, o
 * Expected sample output:
 * Total Ward charge: 75
 */
/* Correction: implemented calculateWardCharge as required by the issue; the starter omitted this method. */
public class Issue58_VH02_HospitalWardAndBedAllocationManager {
    public static void main(String[] args) {
        System.out.println("Total Ward charge: " + calculateWardCharge(25, 3));
    }

    // Required method signature: static int calculateWardCharge(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateWardCharge.
    static int calculateWardCharge(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
