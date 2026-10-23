public class Issue49_MatrixCalculatorConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Matrix");
        System.out.println("Matrix ID: " + record.id);
        System.out.println("Matrix name: " + record.name);
    }
}