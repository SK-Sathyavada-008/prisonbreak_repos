/*
 * SOLUTION NOTES
 * Scenario: Even Item Total — A Print Shop #17
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a print shop, the program is used for a short beginner exercise. Make it follow the stated rule for the supplied values. Keep the solution within basic Java syntax, variables, conditions, loops, arrays, strings, and simple methods.
 * Expected sample output:
 * Even sum: 24
 */
public class Issue10_even_item_total { public static void main(String[] args) { int[] v=new int[]{7, -13, 16, 8, 3}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
