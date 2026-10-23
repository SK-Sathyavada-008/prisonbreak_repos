/*
 * CORRECTION NOTES
 * Buggy snippet: new Summary()
 * Corrected snippet: new Summary("Sample Vehicle", 4)
 * Explanation: Construct a populated object using the supplied sample name and count.
 * Buggy snippet: "Active Vehicles:
 * Corrected snippet: "Active vehicles:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue51_ParkingVehicleObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary("Sample Vehicle", 4);
        System.out.println("Vehicle owner: " + summary.name);
        System.out.println("Active vehicles: " + summary.activeCount);
    }
}