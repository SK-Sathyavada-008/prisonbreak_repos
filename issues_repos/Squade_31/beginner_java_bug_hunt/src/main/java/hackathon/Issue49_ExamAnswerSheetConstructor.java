public class Issue49_ExamAnswerSheetConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Answer");
        System.out.println("Candidate ID: " + record.id);
        System.out.println("Candidate name: " + record.name);
    }
}