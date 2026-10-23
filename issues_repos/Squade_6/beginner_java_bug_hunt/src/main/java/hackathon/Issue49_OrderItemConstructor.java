public class Issue49_OrderItemConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Order");
        System.out.println("Order number: " + record.id);
        System.out.println("Food name: " + record.name);
    }
}