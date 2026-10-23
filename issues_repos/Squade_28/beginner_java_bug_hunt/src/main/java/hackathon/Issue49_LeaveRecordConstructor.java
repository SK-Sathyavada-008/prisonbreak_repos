public class Issue49_LeaveRecordConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Employee");
        System.out.println("Employee ID: " + record.id);
        System.out.println("Employee name: " + record.name);
    }
}