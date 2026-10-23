/*
 * CORRECTION NOTES
 * Buggy snippet: new Summary()
 * Corrected snippet: new Summary("Sample Wallet", 4)
 * Explanation: Construct a populated object using the supplied sample name and count.
 * Buggy snippet: "Active Wallets:
 * Corrected snippet: "Active wallets:
 * Explanation: Match the output label capitalization used by the issue specification.
 */
public class Issue51_DigitalWalletObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary("Sample Wallet", 4);
        System.out.println("Owner name: " + summary.name);
        System.out.println("Active wallets: " + summary.activeCount);
    }
}