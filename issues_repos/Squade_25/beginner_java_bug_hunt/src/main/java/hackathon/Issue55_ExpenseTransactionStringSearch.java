public class Issue55_ExpenseTransactionStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Expense ID found");
        else System.out.println("Expense ID not found");
    }
}