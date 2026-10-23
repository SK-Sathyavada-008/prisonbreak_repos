/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateAccountBalancesPercentage` for Multi-Account Banking and Transaction Ledger
 * Relevant starter snippet: System.out.println("Account balances percentage: " + calculateAccountBalancesPercentage(3, 4));
 * Corrected solution snippet: if (total == 0)
 * Explanation: The starter calls `calculateAccountBalancesPercentage(int completed, int total)`, but the method has not been written. Write this method from scratch. Calculate the percentage represented by completed records out of the supplied total. Return 0 when total is zero. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic 
 * Expected sample output:
 * Account balances percentage: 75.0
 */
/* Correction: implemented calculateAccountBalancesPercentage as required by the issue; the starter omitted this method. */
public class Issue58_VH04_MultiAccountBankingAndTransactionLedger {
    public static void main(String[] args) {
        System.out.println("Account balances percentage: " + calculateAccountBalancesPercentage(3, 4));
    }

    // Required method signature: static double calculateAccountBalancesPercentage(int completed, int total)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateAccountBalancesPercentage.
    static double calculateAccountBalancesPercentage(int completed, int total) {
        if (total == 0) return 0.0;
        return completed * 100.0 / total;
    }
}
