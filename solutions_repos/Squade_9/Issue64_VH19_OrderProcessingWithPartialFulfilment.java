/*
 * SOLUTION NOTES
 * Scenario: Issue #64: Write `calculateUnitPrice` for Order Processing with Partial Fulfilment
 * Relevant starter snippet: System.out.println("Total Unit price: " + calculateUnitPrice(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateUnitPrice(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit unit price and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or 
 * Expected sample output:
 * Total Unit price: 75
 */
/* Correction: implemented calculateUnitPrice as required by the issue; the starter omitted this method. */
public class Issue64_VH19_OrderProcessingWithPartialFulfilment {
    public static void main(String[] args) {
        System.out.println("Total Unit price: " + calculateUnitPrice(25, 3));
    }

    // Required method signature: static int calculateUnitPrice(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateUnitPrice.
    static int calculateUnitPrice(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
