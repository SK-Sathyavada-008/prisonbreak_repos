/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `isValidSellRequest` for Pharmacy with Batch-wise Stock Management
 * Relevant starter snippet: System.out.println("Sell request valid: " + isValidSellRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidSellRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use
 * Expected sample output:
 * Sell request valid: true
 */
/* Correction: implemented isValidSellRequest as required by the issue; the starter omitted this method. */
public class Issue62_VH22_PharmacyWithBatchWiseStockManagement {
    public static void main(String[] args) {
        System.out.println("Sell request valid: " + isValidSellRequest(2, 5));
    }

    // Required method signature: static boolean isValidSellRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidSellRequest.
    static boolean isValidSellRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
