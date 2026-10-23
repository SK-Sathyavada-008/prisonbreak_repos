/*
 * SOLUTION NOTES
 * Scenario: Issue #63: Write `calculateTransactionAmount` for Wallet System with Transfers and Refunds
 * Relevant starter snippet: System.out.println("Total Transaction amount: " + calculateTransactionAmount(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateTransactionAmount(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit transaction amount and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, 
 * Expected sample output:
 * Total Transaction amount: 75
 */
/* Correction: implemented calculateTransactionAmount as required by the issue; the starter omitted this method. */
public class Issue63_VH20_WalletSystemWithTransfersAndRefunds {
    public static void main(String[] args) {
        System.out.println("Total Transaction amount: " + calculateTransactionAmount(25, 3));
    }

    // Required method signature: static int calculateTransactionAmount(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateTransactionAmount.
    static int calculateTransactionAmount(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
