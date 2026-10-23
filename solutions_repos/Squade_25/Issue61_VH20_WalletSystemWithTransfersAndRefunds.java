/*
 * SOLUTION NOTES
 * Scenario: Issue #61: Write `calculateTotalWalletBalances` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Total Wallet balances: " + calculateTotalWalletBalances(new int[] {4, 6, 3}));
 * Corrected solution snippet: for (int value : values)
 * Explanation: The starter calls `calculateTotalWalletBalances(int[] values)`, but the method has not been written. Write this method from scratch. Calculate the sum of all supplied wallet balances. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or external libraries.
 * Expected sample output:
 * Total Wallet balances: 13
 */
/* Correction: implemented calculateTotalWalletBalances as required by the issue; the starter omitted this method. */
public class Issue61_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Total Wallet balances: " + calculateTotalWalletBalances(new int[] {4, 6, 3}));
    }

    // Required method signature: static int calculateTotalWalletBalances(int[] values)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTotalWalletBalances.
    static int calculateTotalWalletBalances(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
}
