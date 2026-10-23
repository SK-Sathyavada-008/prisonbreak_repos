public class Issue55_ComputerComponentStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Component ID found");
        else System.out.println("Component ID not found");
    }
}