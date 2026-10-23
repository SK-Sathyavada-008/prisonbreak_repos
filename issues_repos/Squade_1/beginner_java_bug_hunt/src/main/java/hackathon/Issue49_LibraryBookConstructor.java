public class Issue49_LibraryBookConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Book");
        System.out.println("Book ID: " + record.id);
        System.out.println("Book title: " + record.name);
    }
}