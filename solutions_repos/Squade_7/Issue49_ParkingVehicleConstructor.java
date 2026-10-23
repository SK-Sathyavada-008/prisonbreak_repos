/*
 * CORRECTION NOTES
 * Buggy snippet: this.id = name;             this.name = id;
 * Corrected snippet: this.id=id; this.name=name;
 * Explanation: Assign each constructor parameter to its matching field.
 */
public class Issue49_ParkingVehicleConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id=id; this.name=name;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Vehicle");
        System.out.println("Vehicle number: " + record.id);
        System.out.println("Vehicle owner: " + record.name);
    }
}