/*
 * CORRECTION NOTES
 * Buggy snippet: this.id = name;             this.name = id;
 * Corrected snippet: this.id=id; this.name=name;
 * Explanation: Assign each constructor parameter to its matching field.
 */
public class Issue49_ShopProductConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id=id; this.name=name;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Product");
        System.out.println("Product ID: " + record.id);
        System.out.println("Product name: " + record.name);
    }
}