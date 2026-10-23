public class Issue49_ComputerComponentConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Component");
        System.out.println("Component ID: " + record.id);
        System.out.println("Component name: " + record.name);
    }
}