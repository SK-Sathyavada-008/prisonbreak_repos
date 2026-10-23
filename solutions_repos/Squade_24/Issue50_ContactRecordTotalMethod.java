/*
 * CORRECTION NOTES
 * Buggy snippet: total = unitAmount + quantity;
 * Corrected snippet: total=unitAmount*quantity;
 * Explanation: A total price is unit amount multiplied by quantity.
 * Buggy snippet: "Total Contact count:
 * Corrected snippet: "Total contact count:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue50_ContactRecordTotalMethod {
    public static void main(String[] args) {
        int unitAmount = 25;
        int quantity = 3;
        int total=unitAmount*quantity;
        System.out.println("Total contact count: " + total);
    }
}