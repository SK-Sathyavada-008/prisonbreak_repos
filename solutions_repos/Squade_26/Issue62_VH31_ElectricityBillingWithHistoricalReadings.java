/*
 * SOLUTION NOTES
 * Scenario: Issue #62: Write `calculateRemainingUsageLimit` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Remaining Usage limit: " + calculateRemainingUsageLimit(12, 7));
 * Corrected solution snippet: return capacity - occupied;
 * Explanation: The starter calls `calculateRemainingUsageLimit(int capacity, int occupied)`, but the method has not been written. Write this method from scratch. Calculate how many usage limit remain after the occupied amount is deducted from the total capacity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; 
 * Expected sample output:
 * Remaining Usage limit: 5
 */
/* Correction: implemented calculateRemainingUsageLimit as required by the issue; the starter omitted this method. */
public class Issue62_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Remaining Usage limit: " + calculateRemainingUsageLimit(12, 7));
    }

    // Required method signature: static int calculateRemainingUsageLimit(int capacity, int occupied)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateRemainingUsageLimit.
    static int calculateRemainingUsageLimit(int capacity, int occupied) {
        return capacity - occupied;
    }
}
