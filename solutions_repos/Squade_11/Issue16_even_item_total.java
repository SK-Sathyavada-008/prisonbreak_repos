/*
 * SOLUTION NOTES
 * Scenario: Even Item Total — A Quiz Practice Desk #11
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a quiz practice desk, the program is used for a short beginner exercise. Make it follow the stated rule for the supplied values. Keep the solution within basic Java syntax, variables, conditions, loops, arrays, strings, and simple methods.
 * Expected sample output:
 * Even sum: 8
 */
public class Issue16_even_item_total { public static void main(String[] args) { int[] v=new int[]{10, -12, 11, 10, 13}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
