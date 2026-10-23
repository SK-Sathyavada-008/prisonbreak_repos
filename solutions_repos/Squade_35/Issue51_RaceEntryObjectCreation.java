/*
 * CORRECTION NOTES
 * Buggy snippet: new Summary()
 * Corrected snippet: new Summary("Sample Runner", 4)
 * Explanation: Construct a populated object using the supplied sample name and count.
 * Buggy snippet: "Active Runners:
 * Corrected snippet: "Active runners:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue51_RaceEntryObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary("Sample Runner", 4);
        System.out.println("Runner name: " + summary.name);
        System.out.println("Active runners: " + summary.activeCount);
    }
}