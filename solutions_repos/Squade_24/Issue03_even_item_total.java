/*
 * SOLUTION NOTES
 * Scenario: Even Item Total — A Sports Team #24
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a sports team, the program is used for a short beginner exercise. Make it follow the stated rule for the supplied values. Keep the solution within basic Java syntax, variables, conditions, loops, arrays, strings, and simple methods.
 * Expected sample output:
 * Even sum: 10
 */
public class Issue03_even_item_total { public static void main(String[] args) { int[] v=new int[]{5, -5, 11, 10, 13}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
