/*
 * SOLUTION NOTES
 * Scenario: Sum Even Readings — A Book Fair #05
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a book fair, the program is used for a slightly longer practice task. Make it follow the full rule for the supplied values, including the ordinary boundary case implied by the scenario. Use only the Java topics covered in the course; do not add collections or external libraries.
 * Expected sample output:
 * Even sum: 8
 */
public class Issue70_sum_even_readings { public static void main(String[] args) { int[] v=new int[]{10, -8, 11, 6, 13}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
