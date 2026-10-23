public class Issue49_QuizStudentConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Contestant");
        System.out.println("Contestant ID: " + record.id);
        System.out.println("Contestant name: " + record.name);
    }
}