public class Issue55_MobileRechargeStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Recharge ID found");
        else System.out.println("Recharge ID not found");
    }
}