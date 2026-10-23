/*
 * CORRECTION NOTES
 * Buggy snippet: storedId == requestedId
 * Corrected snippet: storedId.equals(requestedId)
 * Explanation: Compare identifier strings by content.
 */
public class Issue55_DigitalWalletStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId.equals(requestedId)) System.out.println("Wallet ID found");
        else System.out.println("Wallet ID not found");
    }
}