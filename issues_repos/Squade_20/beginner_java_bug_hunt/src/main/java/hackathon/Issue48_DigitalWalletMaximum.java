public class Issue48_DigitalWalletMaximum {
    public static void main(String[] args) {
        int[] values = {-8, -3, -11};
        int highest = 0;
        for (int value : values) {
            if (value > highest) highest = value;
        }
        System.out.println("Highest Wallet balances: " + highest);
    }
}