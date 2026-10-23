public class Issue55_BankAccountRecordStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Account ID found");
        else System.out.println("Account ID not found");
    }
}