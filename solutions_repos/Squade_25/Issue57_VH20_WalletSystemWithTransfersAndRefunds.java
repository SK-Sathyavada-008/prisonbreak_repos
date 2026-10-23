/*
 * SOLUTION NOTES
 * Scenario: Issue #57: Write `calculateRemainingPaymentLimit` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Remaining Payment limit: " + calculateRemainingPaymentLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingPaymentLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many payment limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java construc
 * Expected sample output:
 * Remaining Payment limit: 5
 */
/* Correction: implemented calculateRemainingPaymentLimit as required by the issue; the starter omitted this method. */
public class Issue57_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Remaining Payment limit: " + calculateRemainingPaymentLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingPaymentLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingPaymentLimit.
    static int calculateRemainingPaymentLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
