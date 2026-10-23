public class Issue55_TournamentTeamStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Team ID found");
        else System.out.println("Team ID not found");
    }
}