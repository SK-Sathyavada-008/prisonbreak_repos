/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `findLowestWalletBalances` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Lowest Wallet balances: " + findLowestWalletBalances(new int[] {12, 4, 9, 6}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `findLowestWalletBalances(int[] values)`, but the method has not been written. Write this method from scratch. Return the smallest value in the supplied wallet balances array. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libra
 * Expected sample output:
 * Lowest Wallet balances: 4
 */
/* Correction: implemented findLowestWalletBalances as required by the issue; the starter omitted this method. */
public class Issue59_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Lowest Wallet balances: " + findLowestWalletBalances(new int[] {12, 4, 9, 6}));
    }

    // Required method signature: static int findLowestWalletBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of findLowestWalletBalances.
    static int findLowestWalletBalances(int[] values) {
        if (values.length == 0) return 0;
        int best = values[0];
        for (int value : values) if (value < best) best = value;
        return best;
    }
}
