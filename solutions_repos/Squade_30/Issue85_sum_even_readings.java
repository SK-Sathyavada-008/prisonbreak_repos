/*
 * SOLUTION NOTES
 * Scenario: Sum Even Readings — A Print Shop #30
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a print shop, the program is used for a slightly longer practice task. Make it follow the full rule for the supplied values, including the ordinary boundary case implied by the scenario. Use only the Java topics covered in the course; do not add collections or external libraries.
 * Expected sample output:
 * Even sum: 26
 */
public class Issue85_sum_even_readings { public static void main(String[] args) { int[] v=new int[]{8, -3, 8, 11, 10}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
