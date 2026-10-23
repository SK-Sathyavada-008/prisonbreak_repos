public class Issue55_CinemaTicketStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Ticket ID found");
        else System.out.println("Ticket ID not found");
    }
}