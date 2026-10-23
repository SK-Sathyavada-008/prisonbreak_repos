public class Issue49_CinemaTicketConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Ticket");
        System.out.println("Ticket number: " + record.id);
        System.out.println("Movie title: " + record.name);
    }
}