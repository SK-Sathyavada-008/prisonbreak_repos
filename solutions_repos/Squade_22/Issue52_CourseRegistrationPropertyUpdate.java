/*
 * CORRECTION NOTES
 * Buggy snippet: quantity = 3;
 * Corrected snippet: quantity=7;
 * Explanation: Update the quantity field to the requested value.
 * Buggy snippet: unitAmount = 25;
 * Corrected snippet: unitAmount=25;
 * Explanation: Update the unit amount field to the requested value.
 * Buggy snippet: unitAmount = newQuantity;
 * Corrected snippet: unitAmount=25;
 * Explanation: Update the unit amount field to the requested value.
 */
public class Issue52_CourseRegistrationPropertyUpdate {
    static class Record { int quantity=7; int unitAmount=25; }
    public static void main(String[] args) {
        Record record = new Record();
        int newQuantity = 7;
        record.unitAmount=25;
        System.out.println("Quantity: " + record.quantity);
        System.out.println("Unit amount: " + record.unitAmount);
    }
}