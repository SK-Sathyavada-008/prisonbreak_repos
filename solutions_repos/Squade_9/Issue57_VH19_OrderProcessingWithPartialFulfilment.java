/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `isValidFulfilRequest` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Fulfil request valid: " + isValidFulfilRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidFulfilRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not u
 * Expected sample output:
 * Fulfil request valid: true
 */
/* Correction: implemented isValidFulfilRequest as required by the issue; the starter omitted this method. */
public class Issue57_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Fulfil request valid: " + isValidFulfilRequest(2, 5));
    }

    // Required method signature: static boolean isValidFulfilRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidFulfilRequest.
    static boolean isValidFulfilRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
