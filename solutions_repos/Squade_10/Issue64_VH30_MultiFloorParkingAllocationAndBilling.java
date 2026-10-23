/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `findHighestAvailableParkingSpaces` for Multi-Floor Parking Allocation and Billing
 * Relevant starter snippet: System.out.println("Highest Available parking spaces: " + findHighestAvailableParkingSpaces(new int[] {12, 18, 9, 15}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findHighestAvailableParkingSpaces(int[] values)`, but the method has not been written. Write this method from scratch. Return the highest value in the supplied available parking spaces array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, 
 * Expected sample output:
 * Highest Available parking spaces: 18
 */
/* Correction: implemented findHighestAvailableParkingSpaces as required by the issue; the starter omitted this method. */
public class Issue64_VH30_MultiFloorParkingAllocationAndBilling {
    public static void main(String[] args) {
        System.out.println("Highest Available parking spaces: " + findHighestAvailableParkingSpaces(new int[] {12, 18, 9, 15}));
    }

    // Required method signature: static int findHighestAvailableParkingSpaces(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findHighestAvailableParkingSpaces.
    static int findHighestAvailableParkingSpaces(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value > best) best = value;
        return best;
    }
}
