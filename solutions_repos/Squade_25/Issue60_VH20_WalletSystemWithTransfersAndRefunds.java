/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateDiscountedTransactionAmount` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Discounted Transaction amount: " + calculateDiscountedTransactionAmount(200, 10));
 * Corrected solution snippet: return amount - (amount * percent / 100.0);
 * Explanation: The starter calls `calculateDiscountedTransactionAmount(int amount, int percent)`, but the method has not been written. Write this method from scratch. Calculate the amount left after applying the supplied percentage discount. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collection
 * Expected sample output:
 * Discounted Transaction amount: 180.0
 */
/* Correction: implemented calculateDiscountedTransactionAmount as required by the issue; the starter omitted this method. */
public class Issue60_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Discounted Transaction amount: " + calculateDiscountedTransactionAmount(200, 10));
    }

    // Required method signature: static double calculateDiscountedTransactionAmount(int amount, int percent)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateDiscountedTransactionAmount.
    static double calculateDiscountedTransactionAmount(int amount, int percent) {
        return amount - (amount * percent / 100.0);
    }
}
