/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `containsDestinationName` for Courier Network with Shipment Status History
 * Relevant starter snippet: System.out.println("Destination name found: " + containsDestinationName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsDestinationName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested destination name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; 
 * Expected sample output:
 * Destination name found: true
 */
/* Correction: implemented containsDestinationName as required by the issue; the starter omitted this method. */
public class Issue62_VH17_CourierNetworkWithShipmentStatusHistory {
    public static void main(String[] args) {
        System.out.println("Destination name found: " + containsDestinationName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsDestinationName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsDestinationName.
    static boolean containsDestinationName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
