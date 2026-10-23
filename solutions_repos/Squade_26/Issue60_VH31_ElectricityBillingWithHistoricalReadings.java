/*
 * SOLUTION NOTES
 * Scenario: Issue #60: Write `calculateUnitRate` for Electricity Billing with Historical Readings
 * Relevant starter snippet: System.out.println("Total Unit rate: " + calculateUnitRate(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateUnitRate(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit unit rate and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or ex
 * Expected sample output:
 * Total Unit rate: 75
 */
/* Correction: implemented calculateUnitRate as required by the issue; the starter omitted this method. */
public class Issue60_VH31_ElectricityBillingWithHistoricalReadings {
    public static void main(String[] args) {
        System.out.println("Total Unit rate: " + calculateUnitRate(25, 3));
    }

    // Required method signature: static int calculateUnitRate(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateUnitRate.
    static int calculateUnitRate(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
