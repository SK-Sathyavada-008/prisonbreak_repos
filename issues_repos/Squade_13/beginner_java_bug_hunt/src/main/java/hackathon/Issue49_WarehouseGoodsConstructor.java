public class Issue49_WarehouseGoodsConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Item");
        System.out.println("Item ID: " + record.id);
        System.out.println("Item name: " + record.name);
    }
}