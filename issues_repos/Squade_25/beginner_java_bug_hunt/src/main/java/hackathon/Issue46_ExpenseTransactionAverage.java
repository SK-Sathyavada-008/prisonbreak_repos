public class Issue46_ExpenseTransactionAverage {
    public static void main(String[] args) {
        int[] values = {60, 80, 100};
        int total = 0;
        for (int value : values) total += value;
        double average = (double) total / (values.length + 1);
        System.out.println("Average Expense amounts: " + average);
    }
}