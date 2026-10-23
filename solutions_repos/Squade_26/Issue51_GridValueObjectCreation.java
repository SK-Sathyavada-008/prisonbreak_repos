/*
 * CORRECTION NOTES
 * Buggy snippet: new Summary()
 * Corrected snippet: new Summary("Sample Cell", 4)
 * Explanation: Construct a populated object using the supplied sample name and count.
 * Buggy snippet: "Active Cells:
 * Corrected snippet: "Active cells:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue51_GridValueObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary("Sample Cell", 4);
        System.out.println("Cell value: " + summary.name);
        System.out.println("Active cells: " + summary.activeCount);
    }
}