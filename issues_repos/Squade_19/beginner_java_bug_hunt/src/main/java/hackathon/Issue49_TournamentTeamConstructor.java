public class Issue49_TournamentTeamConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Team");
        System.out.println("Team ID: " + record.id);
        System.out.println("Team name: " + record.name);
    }
}