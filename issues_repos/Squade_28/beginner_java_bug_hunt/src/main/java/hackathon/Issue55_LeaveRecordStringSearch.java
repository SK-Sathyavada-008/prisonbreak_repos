public class Issue55_LeaveRecordStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Employee ID found");
        else System.out.println("Employee ID not found");
    }
}