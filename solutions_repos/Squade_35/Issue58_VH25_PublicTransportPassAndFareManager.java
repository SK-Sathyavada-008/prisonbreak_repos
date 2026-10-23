/*
 * SOLUTION NOTES
 * Scenario: Issue #58: Write `calculateFareAmount` for Public Transport Pass and Fare Manager
 * Relevant starter snippet: System.out.println("Total Fare amount: " + calculateFareAmount(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateFareAmount(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit fare amount and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, o
 * Expected sample output:
 * Total Fare amount: 75
 */
/* Correction: implemented calculateFareAmount as required by the issue; the starter omitted this method. */
public class Issue58_VH25_PublicTransportPassAndFareManager {
    public static void main(String[] args) {
        System.out.println("Total Fare amount: " + calculateFareAmount(25, 3));
    }

    // Required method signature: static int calculateFareAmount(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateFareAmount.
    static int calculateFareAmount(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
