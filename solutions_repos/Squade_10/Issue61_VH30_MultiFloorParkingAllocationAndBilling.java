/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateParkingCharge` for Multi-Floor Parking Allocation and Billing
 * Relevant starter snippet: System.out.println("Total Parking charge: " + calculateParkingCharge(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateParkingCharge(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit parking charge and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherita
 * Expected sample output:
 * Total Parking charge: 75
 */
/* Correction: implemented calculateParkingCharge as required by the issue; the starter omitted this method. */
public class Issue61_VH30_MultiFloorParkingAllocationAndBilling {
    public static void main(String[] args) {
        System.out.println("Total Parking charge: " + calculateParkingCharge(25, 3));
    }

    // Required method signature: static int calculateParkingCharge(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateParkingCharge.
    static int calculateParkingCharge(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
