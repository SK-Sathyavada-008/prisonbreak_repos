public class Issue49_DigitalWalletConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Wallet");
        System.out.println("Wallet ID: " + record.id);
        System.out.println("Owner name: " + record.name);
    }
}