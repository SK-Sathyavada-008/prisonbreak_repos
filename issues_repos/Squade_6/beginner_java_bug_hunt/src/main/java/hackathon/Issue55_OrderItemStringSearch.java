public class Issue55_OrderItemStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Order ID found");
        else System.out.println("Order ID not found");
    }
}