/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateEquipmentFee` for Computer Lab Equipment and Allocation System
 * Relevant starter snippet: System.out.println("Total Equipment fee: " + calculateEquipmentFee(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateEquipmentFee(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit equipment fee and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritanc
 * Expected sample output:
 * Total Equipment fee: 75
 */
/* Correction: implemented calculateEquipmentFee as required by the issue; the starter omitted this method. */
public class Issue62_VH21_ComputerLabEquipmentAndAllocationSystem {
    public static void main(String[] args) {
        System.out.println("Total Equipment fee: " + calculateEquipmentFee(25, 3));
    }

    // Required method signature: static int calculateEquipmentFee(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateEquipmentFee.
    static int calculateEquipmentFee(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
