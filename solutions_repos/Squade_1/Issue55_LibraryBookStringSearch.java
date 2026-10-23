/*
 * CORRECTION NOTES
 * Buggy snippet: storedId == requestedId
 * Corrected snippet: storedId.equals(requestedId)
 * Explanation: Compare identifier strings by content.
 */
public class Issue55_LibraryBookStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId.equals(requestedId)) System.out.println("Book ID found");
        else System.out.println("Book ID not found");
    }
}