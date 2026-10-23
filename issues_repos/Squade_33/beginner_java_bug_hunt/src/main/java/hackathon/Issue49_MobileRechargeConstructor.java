public class Issue49_MobileRechargeConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Recharge");
        System.out.println("Recharge ID: " + record.id);
        System.out.println("Customer name: " + record.name);
    }
}