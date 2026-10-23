/*
 * SOLUTION NOTES
 * Scenario: Issue #59: Write `calculateHostelFee` for Multi-Block Hostel Allocation and Transfer System
 * Relevant starter snippet: System.out.println("Total Hostel fee: " + calculateHostelFee(25, 3));
 * Corrected solution snippet: return unitAmount * quantity;
 * Explanation: The starter calls `calculateHostelFee(int unitAmount, int quantity)`, but the method has not been written. Write this method from scratch. Calculate the total using the supplied unit hostel fee and quantity. Use the supplied values exactly as shown in the starter file. Keep the implementation to basic Java constructs; do not use collections, inheritance, or 
 * Expected sample output:
 * Total Hostel fee: 75
 */
/* Correction: implemented calculateHostelFee as required by the issue; the starter omitted this method. */
public class Issue59_VH01_MultiBlockHostelAllocationAndTransferSystem {
    public static void main(String[] args) {
        System.out.println("Total Hostel fee: " + calculateHostelFee(25, 3));
    }

    // Required method signature: static int calculateHostelFee(int unitAmount, int quantity)
    // Implement the method described in the issue. Do not change the supplied test values.

    // Correct implementation of calculateHostelFee.
    static int calculateHostelFee(int unitAmount, int quantity) {
        return unitAmount * quantity;
    }
}
