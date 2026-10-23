/*
 * CORRECTION NOTES
 * Buggy snippet: new Summary()
 * Corrected snippet: new Summary("Sample Student", 4)
 * Explanation: Construct a populated object using the supplied sample name and count.
 * Buggy snippet: "Active Students:
 * Corrected snippet: "Active students:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue51_AttendanceRecordObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary("Sample Student", 4);
        System.out.println("Student name: " + summary.name);
        System.out.println("Active students: " + summary.activeCount);
    }
}