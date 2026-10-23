/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `countAvailablePaymentLimit` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Available Payment limit: " + countAvailablePaymentLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailablePaymentLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available payment limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritan
 * Expected sample output:
 * Available Payment limit: 3
 */
/* Correction: implemented countAvailablePaymentLimit as required by the issue; the starter omitted this method. */
public class Issue62_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Available Payment limit: " + countAvailablePaymentLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailablePaymentLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailablePaymentLimit.
    static int countAvailablePaymentLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
