/*
 * CORRECTION NOTES
 * Buggy snippet: total = unitAmount + quantity;
 * Corrected snippet: total=unitAmount*quantity;
 * Explanation: A total price is unit amount multiplied by quantity.
 * Buggy snippet: "Total Expense amount:
 * Corrected snippet: "Total expense amount:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue50_ExpenseTransactionTotalMethod {
    public static void main(String[] args) {
        int unitAmount = 25;
        int quantity = 3;
        int total=unitAmount*quantity;
        System.out.println("Total expense amount: " + total);
    }
}