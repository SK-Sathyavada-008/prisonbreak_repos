/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `findLowestAvailableBuses` for Bus Depot and Route Scheduling System
 * Relevant starter snippet: System.out.println("Lowest Available buses: " + findLowestAvailableBuses(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestAvailableBuses(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied available buses array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Lowest Available buses: 4
 */
/* Correction: implemented findLowestAvailableBuses as required by the issue; the starter omitted this method. */
public class Issue60_VH11_BusDepotAndRouteSchedulingSystem {
    public static void main(String[] args) {
        System.out.println("Lowest Available buses: " + findLowestAvailableBuses(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestAvailableBuses(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestAvailableBuses.
    static int findLowestAvailableBuses(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
