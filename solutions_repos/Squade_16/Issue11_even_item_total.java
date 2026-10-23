/*
 * SOLUTION NOTES
 * Scenario: Even Item Total — A Study Group #16
 * Relevant starter snippet: sum+=1;
 * Corrected solution snippet: for(int n:v)
 * Explanation: At a study group, the program is used for a short beginner exercise. Make it follow the stated rule for the supplied values. Keep the solution within basic Java syntax, variables, conditions, loops, arrays, strings, and simple methods.
 * Expected sample output:
 * Even sum: 6
 */
public class Issue11_even_item_total { public static void main(String[] args) { int[] v=new int[]{6, -11, 13, 5, 0}; int sum=0; for(int n:v) if(n%2==0) sum+=n;  System.out.println("Even sum: "+sum); } }
