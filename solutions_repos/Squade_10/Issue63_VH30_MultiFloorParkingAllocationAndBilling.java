/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateRemainingFloorCapacity` for Multi-Floor Parking Allocation and Billing
 * Relevant starter snippet: System.out.println("Remaining Floor capacity: " + calculateRemainingFloorCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingFloorCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many floor capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Floor capacity: 5
 */
/* Correction: implemented calculateRemainingFloorCapacity as required by the issue; the starter omitted this method. */
public class Issue63_VH30_MultiFloorParkingAllocationAndBilling {
    public static void main(String[] args) {
        System.out.println("Remaining Floor capacity: " + calculateRemainingFloorCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingFloorCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingFloorCapacity.
    static int calculateRemainingFloorCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
