/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `countAvailableTransferLimit` for Multi-Account Banking and Transaction Ledger
 * Relevant starter snippet: System.out.println("Available Transfer limit: " + countAvailableTransferLimit(new int[] {1, 0, 3, 0, 2}));
 * Corrected solution snippet: for (int value : values) if (value > 0) count++;
 * Explanation: The starter calls `countAvailableTransferLimit(int[] values)`, but the method has not been written. Write this method from scratch. Count entries with a value greater than zero, representing available transfer limit. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inherit
 * Expected sample output:
 * Available Transfer limit: 3
 */
/* Correction: implemented countAvailableTransferLimit as required by the issue; the starter omitted this method. */
public class Issue62_VH04_MultiAccountBankingAndTransactionLedger {
    public static void main(String[] args) {
        System.out.println("Available Transfer limit: " + countAvailableTransferLimit(new int[] {1, 0, 3, 0, 2}));
    }

    // Required method signature: static int countAvailableTransferLimit(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of countAvailableTransferLimit.
    static int countAvailableTransferLimit(int[] values) {
        int count = 0;
        for (int value : values) if (value > 0) count++;
        return count;
    }
}
