/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `containsAccountHolder` for Multi-Account Banking and Transaction Ledger
 * Relevant starter snippet: System.out.println("Account holder found: " + containsAccountHolder(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
 * Corrected solution snippet: for (String value : names)
 * Explanation: The starter calls `containsAccountHolder(String[] names, String target)`, but the method has not been written. Write this method from scratch. Return true if the supplied list contains the requested account holder text, otherwise return false. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do n
 * Expected sample output:
 * Account holder found: true
 */
/* Correction: implemented containsAccountHolder as required by the issue; the starter omitted this method. */
public class Issue60_VH04_MultiAccountBankingAndTransactionLedger {
    public static void main(String[] args) {
        System.out.println("Account holder found: " + containsAccountHolder(new String[] {"Record-A", "Record-B", "Record-C"}, "Record-B"));
    }

    // Required method signature: static boolean containsAccountHolder(String[] names, String target)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of containsAccountHolder.
    static boolean containsAccountHolder(String[] names, String target) {
        for (String value : names) {
            if (value != null && value.equals(target)) return true;
        }
        return false;
    }
}
