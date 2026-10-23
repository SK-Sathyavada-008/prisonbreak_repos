public class Issue55_RailwaySeatStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Seat ID found");
        else System.out.println("Seat ID not found");
    }
}