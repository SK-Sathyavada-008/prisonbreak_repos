/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateTotalAccountBalances` for Multi-Account Banking and Transaction Ledger
 * Relevant starter snippet: System.out.println("Total Account balances: " + calculateTotalAccountBalances(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalAccountBalances(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied account balances. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Account balances: 13
 */
/* Correction: implemented calculateTotalAccountBalances as required by the issue; the starter omitted this method. */
public class Issue61_VH04_MultiAccountBankingAndTransactionLedger {
    public static void main(String[] args) {
        System.out.println("Total Account balances: " + calculateTotalAccountBalances(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalAccountBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalAccountBalances.
    static int calculateTotalAccountBalances(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
