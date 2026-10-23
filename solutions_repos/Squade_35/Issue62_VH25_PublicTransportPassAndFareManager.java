/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `containsPassengerName` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Passenger name found: " + containsPassengerName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsPassengerName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested passenger name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do n
 * Expected sample output:
 * Passenger name found: true
 */
/* Correction: implemented containsPassengerName as required by the issue; the starter omitted this method. */
public class Issue62_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Passenger name found: " + containsPassengerName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsPassengerName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsPassengerName.
    static boolean containsPassengerName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
