public class Issue49_HotelRoomConstructor {

    static class Record {

        String id;
        String name;

        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }

    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Room");
        System.out.println("Room number: " + record.id);
        System.out.println("Guest name: " + record.name);
    }
}
