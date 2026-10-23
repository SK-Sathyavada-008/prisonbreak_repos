public class Issue49_BloodDonorConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Donor");
        System.out.println("Donor ID: " + record.id);
        System.out.println("Donor name: " + record.name);
    }
}