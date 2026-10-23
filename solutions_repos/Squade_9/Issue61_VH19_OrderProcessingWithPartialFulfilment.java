/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `containsProductName` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Product name found: " + containsProductName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsProductName(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested product name text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not u
 * Expected sample output:
 * Product name found: true
 */
/* Correction: implemented containsProductName as required by the issue; the starter omitted this method. */
public class Issue61_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Product name found: " + containsProductName(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsProductName(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsProductName.
    static boolean containsProductName(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
