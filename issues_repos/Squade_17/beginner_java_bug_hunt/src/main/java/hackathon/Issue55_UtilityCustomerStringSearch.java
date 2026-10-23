public class Issue55_UtilityCustomerStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Customer ID found");
        else System.out.println("Customer ID not found");
    }
}