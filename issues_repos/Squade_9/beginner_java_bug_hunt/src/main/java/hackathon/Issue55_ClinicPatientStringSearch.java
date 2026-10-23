public class Issue55_ClinicPatientStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Patient ID found");
        else System.out.println("Patient ID not found");
    }
}