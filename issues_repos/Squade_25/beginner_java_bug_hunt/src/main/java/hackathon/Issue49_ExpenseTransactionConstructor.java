public class Issue49_ExpenseTransactionConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Expense");
        System.out.println("Expense ID: " + record.id);
        System.out.println("Category name: " + record.name);
    }
}