/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `containsRouteName` for Bus Depot and Route Scheduling System
 * Relevant starter snippet: System.out.println("Route name found: " + containsRouteName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsRouteName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested route name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use c
 * Expected sample output:
 * Route name found: true
 */
/* Correction: implemented containsRouteName as required by the issue; the starter omitted this method. */
public class Issue61_VH11_BusDepotAndRouteSchedulingSystem {
    public static void main(String[] args) {
        System.out.println("Route name found: " + containsRouteName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsRouteName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsRouteName.
    static boolean containsRouteName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
