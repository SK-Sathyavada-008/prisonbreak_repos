/*
 * SOLUTION NOTES
 * Scenario: Sum Even Readings — A Parcel Counter #33
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a parcel counter, the program is used for a slightly longer practice task. Make it follow the full rule for the supplied values, including the ordinary boundary case implied by the scenario. Use only the Java topics covered in the course; do not add collections or external libraries.
 * Expected sample output:
 * Even sum: 12
 */
public class Issue82_sum_even_readings { public static void main(String[] args) { int[] v=new int[]{2, -9, 4, 11, 6}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
