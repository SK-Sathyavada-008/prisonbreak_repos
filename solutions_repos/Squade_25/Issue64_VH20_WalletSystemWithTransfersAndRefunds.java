/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `isValidTransferRequest` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Transfer request valid: " + isValidTransferRequest(2, 5));
 * Corrected solution snippet: return requested >= 1 && requested <= available;
 * Explanation: The starter calls `isValidTransferRequest(int requested, int available)`, but the method has not been written. Write this method from scratch. Return true only when the requested amount is at least 1 and does not exceed the available amount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not
 * Expected sample output:
 * Transfer request valid: true
 */
/* Correction: implemented isValidTransferRequest as required by the issue; the starter omitted this method. */
public class Issue64_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Transfer request valid: " + isValidTransferRequest(2, 5));
    }

    // Required method signature: static boolean isValidTransferRequest(int requested, int available)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of isValidTransferRequest.
    static boolean isValidTransferRequest(int requested, int available) {
        return requested >= 1 && requested <= available;
    }
}
