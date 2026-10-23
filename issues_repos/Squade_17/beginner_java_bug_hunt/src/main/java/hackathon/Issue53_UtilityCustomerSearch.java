public class Issue53_UtilityCustomerSearch {
    public static void main(String[] args) {
        String[] ids = {"A1", "B2", "C3"};
        String target = "C3";
        int found = -1;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i].equals(target)) found = i;
        }
        if (found >= 0) System.out.println("Customer found at index: " + found);
        else System.out.println("Customer not found");
    }
}