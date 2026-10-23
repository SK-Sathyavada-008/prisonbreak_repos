/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `findBusIndex` for Bus Depot and Route Scheduling System
 * Relevant starter snippet: System.out.println("Bus index: " + findBusIndex(new String[] {"A1", "B2", "C3"}, "C3"));
 * Corrected solution snippet: i++) if (ids[i].equals(target)) return i;
 * Explanation: The starter calls `findBusIndex(String[] ids, String target)`, but the method has not been written. Write this method from scratch. Return the zero-based position of the requested bus ID, or -1 if it is not present. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherita
 * Expected sample output:
 * Bus index: 2
 */
/* Correction: implemented findBusIndex as required by the issue; the starter omitted this method. */
public class Issue64_VH11_BusDepotAndRouteSchedulingSystem {
    public static void main(String[] args) {
        System.out.println("Bus index: " + findBusIndex(new String[] {"A1", "B2", "C3"}, "C3"));
    }

    // Required method signature: static int findBusIndex(String[] ids, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findBusIndex.
    static int findBusIndex(String[] ids, String target) {
        for (int i = 0; i < ids.length; i++) if (ids[i].equals(target)) return i;
        return -1;
    }
}
