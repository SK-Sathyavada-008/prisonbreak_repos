/*
 * CORRECTION NOTES
 * Buggy snippet: total = unitAmount + quantity;
 * Corrected snippet: total=unitAmount*quantity;
 * Explanation: A total price is unit amount multiplied by quantity.
 * Buggy snippet: "Total Grid value:
 * Corrected snippet: "Total grid value:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue50_GridValueTotalMethod {
    public static void main(String[] args) {
        int unitAmount = 25;
        int quantity = 3;
        int total=unitAmount*quantity;
        System.out.println("Total grid value: " + total);
    }
}