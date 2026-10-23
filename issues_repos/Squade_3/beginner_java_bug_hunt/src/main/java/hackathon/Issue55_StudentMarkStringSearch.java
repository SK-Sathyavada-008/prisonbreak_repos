public class Issue55_StudentMarkStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Student ID found");
        else System.out.println("Student ID not found");
    }
}