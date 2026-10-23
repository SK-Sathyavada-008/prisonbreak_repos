public class Issue49_ClinicPatientConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Patient");
        System.out.println("Patient ID: " + record.id);
        System.out.println("Patient name: " + record.name);
    }
}