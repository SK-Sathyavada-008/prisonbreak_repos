/*
 * SOLUTION NOTES
 * Scenario: Even Item Total — A Scholarship Desk #18
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a scholarship desk, the program is used for a short beginner exercise. Make it follow the stated rule for the supplied values. Keep the solution within basic Java syntax, variables, conditions, loops, arrays, strings, and simple methods.
 * Expected sample output:
 * Even sum: 18
 */
public class Issue09_even_item_total { public static void main(String[] args) { int[] v=new int[]{8, -4, 6, 0, 8}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
