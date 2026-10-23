/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `containsCustomerName` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Customer name found: " + containsCustomerName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsCustomerName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested customer name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Customer name found: true
 */
/* Correction: implemented containsCustomerName as required by the issue; the starter omitted this method. */
public class Issue57_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Customer name found: " + containsCustomerName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsCustomerName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsCustomerName.
    static boolean containsCustomerName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
