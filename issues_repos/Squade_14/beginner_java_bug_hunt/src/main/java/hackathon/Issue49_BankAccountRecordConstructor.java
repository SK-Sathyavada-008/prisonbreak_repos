public class Issue49_BankAccountRecordConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Account");
        System.out.println("Account number: " + record.id);
        System.out.println("Account holder: " + record.name);
    }
}