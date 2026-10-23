public class Issue55_WarehouseGoodsStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Item ID found");
        else System.out.println("Item ID not found");
    }
}