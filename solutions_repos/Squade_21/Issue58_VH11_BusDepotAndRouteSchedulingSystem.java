/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateRemainingRouteCapacity` for Bus Depot and Route Scheduling System
 * Relevant starter snippet: System.out.println("Remaining Route capacity: " + calculateRemainingRouteCapacity(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingRouteCapacity(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many route capacity remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constr
 * Expected sample output:
 * Remaining Route capacity: 5
 */
/* Correction: implemented calculateRemainingRouteCapacity as required by the issue; the starter omitted this method. */
public class Issue58_VH11_BusDepotAndRouteSchedulingSystem {
    public static void main(String[] args) {
        System.out.println("Remaining Route capacity: " + calculateRemainingRouteCapacity(12, 7));
    }

    // Required method signature: static int calculateRemainingRouteCapacity(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingRouteCapacity.
    static int calculateRemainingRouteCapacity(int capacity, int occupied) {
        return capacity - occupied;
    }
}
