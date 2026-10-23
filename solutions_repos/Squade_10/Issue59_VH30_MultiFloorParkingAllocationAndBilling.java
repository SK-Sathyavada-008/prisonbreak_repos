/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateTotalAvailableParkingSpaces` for Multi-Floor Parking Allocation and Billing
 * Relevant starter snippet: System.out.println("Total Available parking spaces: " + calculateTotalAvailableParkingSpaces(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAvailableParkingSpaces(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied available parking spaces. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or externa
 * Expected sample output:
 * Total Available parking spaces: 13
 */
/* Correction: implemented calculateTotalAvailableParkingSpaces as required by the issue; the starter omitted this method. */
public class Issue59_VH30_MultiFloorParkingAllocationAndBilling {
    public static void main(String[] args) {
        System.out.println("Total Available parking spaces: " + calculateTotalAvailableParkingSpaces(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAvailableParkingSpaces(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAvailableParkingSpaces.
    static int calculateTotalAvailableParkingSpaces(int[] values) {
        int total = 0;
        for (int value : values) if (value > 0) total += value;
        return total;
    }
}
