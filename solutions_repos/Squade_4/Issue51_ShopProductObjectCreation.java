/*
 * CORRECTION NOTES
 * Buggy snippet: new Summary()
 * Corrected snippet: new Summary("Sample Product", 4)
 * Explanation: Construct a populated object using the supplied sample name and count.
 * Buggy snippet: "Active Products:
 * Corrected snippet: "Active products:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue51_ShopProductObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary("Sample Product", 4);
        System.out.println("Product name: " + summary.name);
        System.out.println("Active products: " + summary.activeCount);
    }
}