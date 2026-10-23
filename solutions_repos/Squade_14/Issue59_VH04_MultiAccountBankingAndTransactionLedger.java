/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `findLowestAccountBalances` for Multi-Account Banking and Transaction Ledger
 * Relevant starter snippet: System.out.println("Lowest Account balances: " + findLowestAccountBalances(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestAccountBalances(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied account balances array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external lib
 * Expected sample output:
 * Lowest Account balances: 4
 */
/* Correction: implemented findLowestAccountBalances as required by the issue; the starter omitted this method. */
public class Issue59_VH04_MultiAccountBankingAndTransactionLedger {
    public static void main(String[] args) {
        System.out.println("Lowest Account balances: " + findLowestAccountBalances(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestAccountBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestAccountBalances.
    static int findLowestAccountBalances(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
