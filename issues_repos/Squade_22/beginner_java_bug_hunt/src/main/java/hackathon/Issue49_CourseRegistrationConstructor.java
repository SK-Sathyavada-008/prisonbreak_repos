public class Issue49_CourseRegistrationConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Course");
        System.out.println("Course ID: " + record.id);
        System.out.println("Course name: " + record.name);
    }
}